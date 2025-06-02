package hw30052025.Composite;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer thirdJavaDeveloper = new JavaDeveloper();

        Developer firstJavaScriptDeveloper = new JavaScriptDeveloper();
        Developer secondJavaScriptDeveloper = new JavaScriptDeveloper();
        Developer thirdJavaScriptDeveloper = new JavaScriptDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(thirdJavaDeveloper);
        team.addDeveloper(firstJavaScriptDeveloper);
        team.addDeveloper(secondJavaScriptDeveloper);
        team.addDeveloper(thirdJavaScriptDeveloper);

        team.removeDeveloper(thirdJavaDeveloper);
        team.removeDeveloper(secondJavaScriptDeveloper);

        team.developApp();
    }
}
