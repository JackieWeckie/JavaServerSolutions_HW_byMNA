package hw30042025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class Client {
    private static final int PORT = 12345;
    private static final String HOST = "localhost";

    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        try (SocketChannel client = SocketChannel.open()) {
            client.connect(new InetSocketAddress(HOST, PORT));
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Выберите операцию (Умножить, Разделить, Сложить, Вычесть): ");
        }
        SocketChannel client = null;
        String line = reader.readLine();
        if (!line.endsWith("\n")) line += "\n";

        ByteBuffer buffer = ByteBuffer.wrap(line.getBytes(StandardCharsets.UTF_8));
        client.write(buffer);

        ByteBuffer responseBuffer = ByteBuffer.allocate(256);
        int read = client.read(responseBuffer);
        if (read > 0) {
            String response = new String(responseBuffer.array(), 0, read, StandardCharsets.UTF_8);
            System.out.println("Result: " + response.trim());
        }

    }
}
