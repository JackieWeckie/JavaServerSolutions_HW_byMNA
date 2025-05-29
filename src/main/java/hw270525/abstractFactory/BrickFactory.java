package hw270525.abstractFactory;

public class BrickFactory implements Brick {

    @Override
    public void create() {
        System.out.println("Кирпич был произведён!");
    }
}
