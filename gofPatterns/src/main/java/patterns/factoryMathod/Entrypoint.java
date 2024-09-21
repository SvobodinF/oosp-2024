package patterns.factoryMathod;

import patterns.factoryMathod.interfaces.Restaurant;
import patterns.factoryMathod.models.restaurant.ChineseRestaurant;
import patterns.factoryMathod.models.restaurant.ItalianRestaurant;
import patterns.factoryMathod.models.restaurant.MexicanRestaurant;

import java.util.ArrayList;
import java.util.List;

public class Entrypoint {
    public static void main(String[] args) {
        List<Restaurant> restaurants = new ArrayList<Restaurant>();

        restaurants.add(new ItalianRestaurant());
        restaurants.add(new ChineseRestaurant());
        restaurants.add(new MexicanRestaurant());

        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant.getDish().GetName());
        }
    }
}
