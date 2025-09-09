package lab7.Task3;

public class DrawRectangleCommand implements DrawCommand{
    private DiagramCanvas canvas;
    private int addedIndex = -1;

    public DrawRectangleCommand(DiagramCanvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void execute() {
        canvas.addComponent(new DiagramComponent());
        addedIndex = canvas.getComponents().size() - 1;
    }

    @Override
    public void undo() {
        if (addedIndex >= 0 && addedIndex < canvas.getComponents().size())
            canvas.getComponents().remove(addedIndex);
    }

    @Override
    public String toString() {
        return "DrawRecatangleCommand at index " + addedIndex;
    }
}
