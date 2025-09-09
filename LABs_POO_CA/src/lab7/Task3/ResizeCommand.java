package lab7.Task3;

public class ResizeCommand implements DrawCommand{
    private DiagramCanvas canvas;
    private int index;
    private double percent;

    private int prevWidth, prevHeight;

    public ResizeCommand(DiagramCanvas canvas, int index, double percent) {
        this.canvas = canvas;
        this.index = index;
        this.percent = percent;
    }

    @Override
    public void execute() {
        prevWidth = canvas.getComponent(index).getWidth();
        prevHeight = canvas.getComponent(index).getHeight();
        canvas.getComponent(index).resize(percent);
    }

    @Override
    public void undo() {
        canvas.getComponent(index).setHeight(prevHeight);
        canvas.getComponent(index).setWidth(prevWidth);
    }

    @Override
    public String toString() {
        return "ResizeCommand{" +
                "canvas=" + canvas +
                ", index=" + index +
                ", percent=" + percent +
                '}';
    }
}
