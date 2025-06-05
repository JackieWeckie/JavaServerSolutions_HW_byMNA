package hw04062025.Visitor;

public class Database implements ProjectElement {
    @Override
    public void write(Developer developer) {
        developer.create(this);
    }
}
