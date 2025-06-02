package hw30052025.Composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void developApp() {
        System.out.println("Приложение в разработке...");

        for (Developer developer : developers) {
            developer.developApplication();
        }
    }
}
