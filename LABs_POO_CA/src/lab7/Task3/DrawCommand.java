package lab7.Task3;

public interface DrawCommand {
    void execute();
    void undo();
    String toString();
}

