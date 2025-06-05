package hw04062025.Visitor;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Работа джуниора над проектом началась!");
        project.write(junior);
        System.out.println("Джуниор завершил работу.");

        System.out.println("==========================================================================");

        System.out.println("Работа сеньора над проектом началась!");
        project.write(senior);
        System.out.println("Сеньор завершил работу.");
    }
}
