package hw04062025.Command;

public class CreateDatabase implements Executor {

    private Database database;

    public CreateDatabase(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.create();
    }
}
