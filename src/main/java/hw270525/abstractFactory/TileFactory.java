package hw270525.abstractFactory;

public interface TileFactory {
    Brick createBrick();
    Cobblestone createCobblestone();
    Granite createGranite();
}
