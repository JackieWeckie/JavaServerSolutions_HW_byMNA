package hw30042025;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
import java.nio.charset.StandardCharsets;

public class Server {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        ServerSocketChannel serverSocket = ServerSocketChannel.open();
        serverSocket.bind(new InetSocketAddress(PORT));
        serverSocket.register(selector, SelectionKey.OP_ACCEPT);

        System.out.println("Server started on port " + PORT);

        while (true) {
            selector.select();
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> it = keys.iterator();

            while (it.hasNext()) {
                SelectionKey key = it.next();
                it.remove();

                if (key.isAcceptable()) {
                    SocketChannel client = serverSocket.accept();
                    client.configureBlocking(false);
                    client.register(selector, SelectionKey.OP_READ, ByteBuffer.allocate(256));
                } else if (key.isReadable()) {
                    SocketChannel client = (SocketChannel) key.channel();
                    ByteBuffer buffer = (ByteBuffer) key.attachment();
                    int read = client.read(buffer);
                    if (read == -1) {
                        client.close();
                        continue;
                    }
                    String request = new String(buffer.array(), 0, buffer.position(), StandardCharsets.UTF_8);
                    if (request.contains("\n")) {
                        String line = request.trim();
                        String response = process(line) + "\n";
                        ByteBuffer responseBuffer = ByteBuffer.wrap(response.getBytes(StandardCharsets.UTF_8));
                        client.write(responseBuffer);
                        client.close();
                    }
                }
            }
        }
    }

    private static String process(String request) {
        try {
            String[] parts = request.split(" ");
            if (parts.length != 3) return "Неверный формат!";

            String op = parts[0].toUpperCase();
            double a = Double.parseDouble(parts[1]);
            double b = Double.parseDouble(parts[2]);
            double result;

            switch (op) {
                case "ADD":
                    result = a + b;
                    break;
                case "SUB":
                    result = a - b;
                    break;
                case "MUL":
                    result = a / b;
                    break;
                case "DIV":
                    if (b == 0) return "Вы не можете делить на 0. Введите другое положительное число.";
                    result = a / b;
                    break;
                default:
                    return "Неверная операция!";
            }
            return String.valueOf(result);
        } catch (Exception e) {
            return "Ошибка: " + e.getMessage();
        }
    }
}
