package lab7.Task3;

public class ChangeColorCommand implements DrawCommand {
    private DiagramCanvas canvas;
    private int index;
    private String newColor;
    private String previousColor;

    public ChangeColorCommand(DiagramCanvas canvas, int index, String newColor) {
        this.canvas = canvas;
        this.index = index;
        this.newColor = newColor;
    }

    @Override
    public void execute() {
        previousColor =  canvas.getComponent(index).getColor();
        canvas.getComponent(index).changeColor(newColor);
    }

    @Override
    public void undo() {
        canvas.getComponent(index).changeColor(previousColor);
    }

    @Override
    public String toString() {
        return "ChangeColorCommand{" +
                "canvas=" + canvas +
                ", index=" + index +
                ", newColor='" + newColor + '\'' +
                '}';
    }
}
