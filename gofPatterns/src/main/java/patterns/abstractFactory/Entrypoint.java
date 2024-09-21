package patterns.abstractFactory;

import patterns.abstractFactory.interfaces.CityFactory;
import patterns.abstractFactory.models.buildings.Building;
import patterns.abstractFactory.models.buildings.Cities.BostonFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Entrypoint {
    public static void main(String[] args) {
        List<Building> buildings = new ArrayList<Building>();

        buildings.addAll(getAllBuildings(new BostonFactory()));

        for (Building building : buildings) {
            System.out.println(building.getInfo());
        }
    }

    private static Collection<Building> getAllBuildings(CityFactory factory){
        List<Building> buildings = new ArrayList<Building>();

        buildings.add(factory.getResidential());
        buildings.add(factory.getIndustrial());
        buildings.add(factory.getCommercial());

        return buildings;
    }
}
