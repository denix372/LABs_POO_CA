package lab7.Task3;

import java.util.Stack;

public class Invoker {
    private Stack<DrawCommand> history = new Stack<>();
    private Stack<DrawCommand> undone = new Stack<>();

    public void execute(DrawCommand command) {
        command.execute();
        history.push(command);
        undone.clear();
        System.out.println("Executed: " + command);
    }

    public void undo() {
        if(!history.isEmpty()) {
            DrawCommand command = history.pop();
            command.undo();
            undone.push(command);
            System.out.println("Undone: " + command);
        }
    }

    public void redo() {
        if(!undone.isEmpty()) {
            DrawCommand command = undone.pop();
            command.execute();
            history.push(command);
            System.out.println("Redone: " + command);
        }
    }

    public void reset() {
        history.clear();
        undone.clear();
        System.out.println("Invoker reset.");
    }
}
