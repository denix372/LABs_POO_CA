package lab7.Task3;

public class ChangeTextCommand implements DrawCommand {
    private DiagramCanvas canvas;
    private int index;
    private String newText;
    private String prevText;

    public ChangeTextCommand(DiagramCanvas canvas, int index, String newText) {
        this.canvas = canvas;
        this.index = index;
        this.newText = newText;
    }

    @Override
    public void execute() {
        prevText = canvas.getComponent(index).getText();
        canvas.getComponent(index).changeText(newText);
    }

    @Override
    public void undo() {
        canvas.getComponent(index).changeText(prevText);
    }

    @Override
    public String toString() {
        return "ChangeColorCommand{" +
                "canvas=" + canvas +
                ", index=" + index +
                ", newText='" + newText + '\'' +
                '}';
    }
}
