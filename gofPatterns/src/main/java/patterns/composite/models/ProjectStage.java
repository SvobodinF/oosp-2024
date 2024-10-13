package patterns.composite.models;

import patterns.composite.interfaces.ProjectComponent;

import java.util.ArrayList;
import java.util.List;

public class ProjectStage implements ProjectComponent {
    private String stageName;
    private List<ProjectComponent> components = new ArrayList<>();

    public ProjectStage(String stageName) {
        this.stageName = stageName;
    }

    @Override
    public void add(ProjectComponent component) {
        components.add(component);
    }

    @Override
    public void remove(ProjectComponent component) {
        components.remove(component);
    }

    @Override
    public ProjectComponent getChild(int index) {
        return components.get(index);
    }

    @Override
    public void execute() {
        System.out.println("Executing stage: " + stageName);
        for (ProjectComponent component : components) {
            component.execute();
        }
    }
}

