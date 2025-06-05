package hw04062025.Visitor;

public class Test implements ProjectElement {
    @Override
    public void write(Developer developer) {
        developer.create(this);
    }
}
