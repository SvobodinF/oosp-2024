package patterns.factoryMathod.models.restaurant;

import patterns.factoryMathod.interfaces.Restaurant;
import patterns.factoryMathod.models.dish.Dish;
import patterns.factoryMathod.models.dish.PizzaDish;

public class ItalianRestaurant implements Restaurant {
    public Dish getDish() {
        return new PizzaDish();
    }
}
