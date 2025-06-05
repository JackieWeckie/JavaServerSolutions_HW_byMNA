package hw270525.abstractFactory;

public class GraniteFactory implements Granite {

    @Override
    public void create() {
        System.out.println("Гранит был успешно произведён!");
    }
}
