package hw04062025.Visitor;

public interface Developer {
    public void create(ProjectClass projectClass);

    public void create(Database database);

    public void create(Test test);
}
