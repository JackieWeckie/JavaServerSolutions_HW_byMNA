package hw270525.fabricMethod;

public class AirplaneFactory extends TransportFactory {
    @Override
    public Logistic create(String category, String brand, String model) {
        return Airplane.builder()
                .category(category)
                .brand(brand)
                .model(model)
                .build();
    }
}
