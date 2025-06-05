package hw270525.fabricMethod;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Train implements Logistic {
    private String category;
    private String brand;
    private String model;

    @Override
    public void construct() {
        System.out.println("Транспортное средство категории " + category + " от компании " + brand + " модели " + model
                + " было успешно создано!");
    }

    @Override
    public void deliver() {
        System.out.println(category + "" + brand + "" + model + " доставит ваш заказ немедленно.");
    }
}
