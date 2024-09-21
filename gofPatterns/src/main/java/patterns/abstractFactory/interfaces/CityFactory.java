package patterns.abstractFactory.interfaces;

import patterns.abstractFactory.models.buildings.CommercialBuilding;
import patterns.abstractFactory.models.buildings.IndustrialBuilding;
import patterns.abstractFactory.models.buildings.ResidentialBuilding;

public interface CityFactory {
    ResidentialBuilding getResidential();
    CommercialBuilding getCommercial();
    IndustrialBuilding getIndustrial();
}
