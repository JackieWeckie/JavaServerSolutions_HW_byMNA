package hw04062025.Command;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new CreateDatabase(database),
                new ReadDatabase(database),
                new UpdateDatabase(database),
                new DeleteDatabase(database)
        );

        developer.createCommand();
        developer.readCommand();
        developer.updateCommand();
        developer.deleteCommand();
    }
}
