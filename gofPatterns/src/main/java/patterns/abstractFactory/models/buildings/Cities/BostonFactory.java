package patterns.abstractFactory.models.buildings.Cities;

import patterns.abstractFactory.interfaces.CityFactory;
import patterns.abstractFactory.models.buildings.*;
import patterns.abstractFactory.models.buildings.impls.*;

public class BostonFactory implements CityFactory {

    public ResidentialBuilding getResidential() {
        return new BostonResidential();
    }

    public CommercialBuilding getCommercial() {
        return new BostonCommercial();
    }

    public IndustrialBuilding getIndustrial() {
        return new BostonIndustrial();
    }
}
