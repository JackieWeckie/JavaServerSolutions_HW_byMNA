package hw30052025.Bridge;

public class Main {
    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication(new JavaDeveloper());
        bankApplication.developProgram();

        CalculatorApplication calculatorApplication = new CalculatorApplication(new JavaScriptDeveloper());
        calculatorApplication.developProgram();
    }
}
