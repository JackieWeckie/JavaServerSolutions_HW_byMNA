package hw04062025.Command;

public class Developer {
    Executor create;
    Executor read;
    Executor update;
    Executor delete;

    public Developer(Executor create, Executor read, Executor update, Executor delete) {
        this.create = create;
        this.read = read;
        this.update = update;
        this.delete = delete;
    }

    public void createCommand() {
        create.execute();
    }

    public void readCommand() {
        read.execute();
    }

    public void updateCommand() {
        update.execute();
    }

    public void deleteCommand() {
        delete.execute();
    }
}
