package lab5.task2;

import lab5.task1.Task;

import java.util.LinkedList;

public class Queue implements Container{
    private final java.util.Queue<Task> tasks = new LinkedList<>();

    @Override
    public Task pop() {
        return tasks.poll();
    }

    @Override
    public void push(Task task) {
        tasks.offer(task);
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
        while (!container.isEmpty()) {
            this.push(container.pop());
        }
    }

}
