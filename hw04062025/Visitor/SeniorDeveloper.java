package hw04062025.Visitor;

public class SeniorDeveloper implements Developer {

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Сеньор-разработчик исправляет код джуниор-разработчика...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Сеньор-разработчик добавляет новые значения в базу данных...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Сеньор-разработчик переписывает UNIT-Тесты...");
    }
}
