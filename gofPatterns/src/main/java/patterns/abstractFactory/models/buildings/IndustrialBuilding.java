package patterns.abstractFactory.models.buildings;

public abstract class IndustrialBuilding extends Building{
    protected final BuildingsType getBuildingType() {
        return BuildingsType.industrial;
    }
}
