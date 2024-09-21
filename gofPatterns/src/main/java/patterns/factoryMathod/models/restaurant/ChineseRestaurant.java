package patterns.factoryMathod.models.restaurant;

import patterns.factoryMathod.interfaces.Restaurant;
import patterns.factoryMathod.models.dish.Dish;
import patterns.factoryMathod.models.dish.FriedRiceDish;

public class ChineseRestaurant implements Restaurant {
    public Dish getDish() {
        return new FriedRiceDish();
    }
}
