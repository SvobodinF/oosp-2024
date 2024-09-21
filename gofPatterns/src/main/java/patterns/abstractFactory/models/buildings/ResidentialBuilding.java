package patterns.abstractFactory.models.buildings;

public abstract class ResidentialBuilding extends Building{
    protected final BuildingsType getBuildingType() {
        return BuildingsType.residential;
    }
}
