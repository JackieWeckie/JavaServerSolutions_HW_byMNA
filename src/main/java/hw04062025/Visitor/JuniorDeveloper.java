package hw04062025.Visitor;

public class JuniorDeveloper implements Developer {

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Джуниор-разработчик создаёт проект...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Джуниор-разработчик создаёт базу данных...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Джуниор-разработчик пишет UNIT-Тесты...");
    }
}
