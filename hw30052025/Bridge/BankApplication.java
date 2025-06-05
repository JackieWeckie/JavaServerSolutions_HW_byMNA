package hw30052025.Bridge;

public class BankApplication extends Program {

    public BankApplication(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Написание приложения банка в процессе...");
        developer.writeCode();
    }
}
