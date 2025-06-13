package hw04062025.Command;

public class UpdateDatabase implements Executor {

    private Database database;

    public UpdateDatabase(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
