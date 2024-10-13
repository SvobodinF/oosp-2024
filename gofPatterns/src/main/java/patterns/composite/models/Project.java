package patterns.composite.models;

import patterns.composite.interfaces.ProjectComponent;

import java.util.*;

public class Project implements ProjectComponent {
    private String projectName;
    private List<ProjectComponent> components = new ArrayList<>();

    public Project(String projectName) {
        this.projectName = projectName;
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
        System.out.println("Executing project: " + projectName);
        for (ProjectComponent component : components) {
            component.execute();
        }
    }
}

