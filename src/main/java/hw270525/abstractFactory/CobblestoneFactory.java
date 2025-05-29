package hw270525.abstractFactory;

public class CobblestoneFactory implements Cobblestone {

    @Override
    public void create() {
        System.out.println("Брусчатка была успешно произведена!");
    }
}
