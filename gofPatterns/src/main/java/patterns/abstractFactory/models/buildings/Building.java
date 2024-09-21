package patterns.abstractFactory.models.buildings;

public abstract class Building {
    protected abstract BuildingsType getBuildingType();
    protected abstract String getName();
    public String getInfo(){
        return getName() + " is - " + getBuildingType().toString();
    }
}
