package patterns.factoryMathod.models.restaurant;

import patterns.factoryMathod.interfaces.Restaurant;
import patterns.factoryMathod.models.dish.BurritoDish;
import patterns.factoryMathod.models.dish.Dish;

public class MexicanRestaurant implements Restaurant {
    public Dish getDish() {
        return new BurritoDish();
    }
}
