package lab5.task2;

import lab5.task1.Task;

import java.util.ArrayList;
import java.util.List;

public class Stack implements Container {
    private final List<Task> tasks = new ArrayList<>();

    @Override
    public Task pop() {
        if (isEmpty()) {
            return null;
        }
        return tasks.removeLast();
    }

    @Override
    public void push(Task task) {
        tasks.add(task);
    }

    @Override
    public int size() {
        return tasks.size();
    }

    @Override
    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    @Override
    public void transferFrom(Container container) {
        while(!container.isEmpty()) {
            this.push(container.pop());
        }
    }
}
