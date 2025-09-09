package lab7.Task3;

import java.util.ArrayList;
import java.util.List;

public class DiagramCanvas {
    private List<DiagramComponent> components = new ArrayList<>();

    public void addComponent(DiagramComponent component) {
        components.add(component);
    }

    public DiagramComponent getComponent(int index) {
        return components.get(index);
    }

    public List<DiagramComponent> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return components.toString();
    }
}
