package ua.edu.ucu.demo.flowers;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.demo.Items.Item;

@Setter
public class Flower extends Item {
    /**
     * Flower has:
     * color (Blue or Red)
     * sepalLength (double)
     * FlowerType (Tulip or Rose or Chamomile)
     */
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public void setPrice(int number) {
        price = number;
    }

    public String getColor() {
        return color.toString();
    }

}