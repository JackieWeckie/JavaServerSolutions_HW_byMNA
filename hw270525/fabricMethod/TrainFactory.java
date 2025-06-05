package hw270525.fabricMethod;

public class TrainFactory extends TransportFactory {
    @Override
    public Logistic create(String category, String brand, String model) {
        return Train.builder()
                .category(category)
                .brand(brand)
                .model(model)
                .build();
    }
}
