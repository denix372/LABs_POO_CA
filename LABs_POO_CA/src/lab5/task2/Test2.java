package lab5.task2;

import lab5.task1.OutTask;

public class Test2 {
    public static void main(String[] args) {
        Container stack = new Stack();
        Container queue = new Queue();

        stack.push(new OutTask("Task 1"));
        stack.push(new OutTask("Task 2"));
        stack.push(new OutTask("Task 3"));

        queue.push(new OutTask("Task A"));
        queue.push(new OutTask("Task B"));

        System.out.println("Stack pop (LIFO):");
        while (!stack.isEmpty()) {
            stack.pop().execute();
        }

        System.out.println("Queue pop (FIFO):");
        while (!queue.isEmpty()) {
            queue.pop().execute();
        }
    }
}
