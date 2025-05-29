package hw270525;

import com.sun.jdi.connect.Transport;
import hw270525.abstractFactory.Brick;
import hw270525.abstractFactory.BrickFactory;
import hw270525.abstractFactory.CobblestoneFactory;
import hw270525.abstractFactory.GraniteFactory;
import hw270525.fabricMethod.*;

public class Main {
    public static void main(String[] args) {
        fabricMethod();
        abstractFactory();
    }

    static void fabricMethod() {
        TransportFactory airplaneFactory = new AirplaneFactory();
        TransportFactory trainFactory = new TrainFactory();

        Logistic airplane1 = airplaneFactory.create(" грузовой самолёт ", " Embraer ", " 170 ");
        airplane1.construct();
        airplane1.deliver();

        Logistic train1 = trainFactory.create(" грузовой поезд ", " Servtrans ", " LE3400 ");
        train1.construct();
        train1.deliver();
    }

    static void abstractFactory() {
        BrickFactory brickFactory = new BrickFactory();
        CobblestoneFactory cobblestoneFactory = new CobblestoneFactory();
        GraniteFactory graniteFactory = new GraniteFactory();

        brickFactory.create();
        cobblestoneFactory.create();
        graniteFactory.create();
    }
}
