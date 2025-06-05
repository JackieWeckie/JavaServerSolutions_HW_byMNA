package hw04062025.Visitor;

public class ProjectClass implements ProjectElement {
    @Override
    public void write(Developer developer) {
        developer.create(this);
    }
}
