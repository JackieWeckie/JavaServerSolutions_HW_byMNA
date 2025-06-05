package hw30052025.Bridge;

public class CalculatorApplication extends Program {

    public CalculatorApplication(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Написание калькулятора в процессе...");
        developer.writeCode();
    }
}
