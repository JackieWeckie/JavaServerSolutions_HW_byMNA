package hw04062025.Command;

public class DeleteDatabase implements Executor {

    private Database database;

    public DeleteDatabase(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
