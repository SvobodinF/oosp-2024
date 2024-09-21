package patterns.abstractFactory.models.buildings;

public abstract class CommercialBuilding extends Building{
    protected final BuildingsType getBuildingType() {
        return BuildingsType.commercial;
    }
}
