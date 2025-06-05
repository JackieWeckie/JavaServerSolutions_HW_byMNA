package hw04062025.Visitor;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[] {
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void write(Developer developer) {
        for (ProjectElement element : projectElements) {
            element.write(developer);
        }
    }
}
