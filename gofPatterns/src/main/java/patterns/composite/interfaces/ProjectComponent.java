package patterns.composite.interfaces;

public interface ProjectComponent {
    void add(ProjectComponent component);
    void remove(ProjectComponent component);
    ProjectComponent getChild(int index);
    void execute();
}
