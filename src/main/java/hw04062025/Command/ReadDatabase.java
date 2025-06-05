package hw04062025.Command;

public class ReadDatabase implements Executor {

    private Database database;

    public ReadDatabase(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.read();
    }
}
