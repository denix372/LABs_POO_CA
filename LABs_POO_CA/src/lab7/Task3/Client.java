package lab7.Task3;

public class Client {
    public static void main(String[] args) {
        DiagramCanvas canvas = new DiagramCanvas();
        Invoker invoker = new Invoker();

        System.out.println("Initial: ");
        System.out.println(canvas);

        invoker.execute(new DrawRectangleCommand(canvas));
        invoker.execute(new ResizeCommand(canvas, 0, 1.5));
        invoker.execute(new ChangeColorCommand(canvas, 0, "black"));
        invoker.execute(new ChangeTextCommand(canvas, 0, "Hello"));

        System.out.println("Before undo:");
        System.out.println(canvas);

        invoker.undo();
        invoker.undo();
        invoker.redo();

        System.out.println("After undo:");
        System.out.println(canvas);

    }
}
