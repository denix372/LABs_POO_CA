package lab8.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


/*
 *
 *  ¨¨¨¨¨¨¨¨¨¨*
 *  ¨¨¨¨¨¨¨¨¨**
 *  ¨¨¨¨¨¨¨¨¨*o*
 *  ¨¨¨¨¨¨¨¨*☺*o*
 *  ¨¨¨¨¨¨¨***o***
 *  ¨¨¨¨¨¨**o**☺*o*
 *  ¨¨¨¨¨**☺**o**o**
 *  ¨¨¨¨**o**☺***☺*o*                 ECHIPA OOP vă urează un Crăciun fericit,
 *  ¨¨¨*****☺*o**o****                      și un AN NOU fără restanțe!
 *  ¨¨**☺**o*****o**☺**
 *  ¨void*o*void*o*void*o*
 *  ****o***☺**o***o***☺*
 *  ¨¨¨¨¨____!_!____
 *  ¨¨¨¨¨\_________/¨¨
 *
 */


// TODO: Discuss with the teaching assistant why it was necessary to use a bounded type: < T extends Comparable<T>>
class Node<T extends Comparable<T>> {

    private T value;
    private Node<T> right;
    private Node<T> left;

    // TODO: Generate constructor, getter and setters
    public Node(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

// TODO: Discuss with the teaching assistant why it was necessary to use a bounded type: < T extends Comparable<T>>
interface Tree<T extends Comparable<T>> {

    void addValue(T value);

    void addAll(List<T> values);

    HashSet<T> getValues(T inf, T sup);

    int size();

    boolean isEmpty();
}

//TODO: Add your implementation
class TreeImpl<T extends Comparable<T>> implements Tree<T> {
    private Node<T> root;
    private int size = 0;

    @Override
    public void addValue(T value) {
        if (root == null) {
            root = new Node<>(value);
            size++;
        } else {
            insertRecursive(root, value);
        }
    }

    private void insertRecursive(Node<T> current, T value) {
        int cmp = value.compareTo(current.getValue());

        if (cmp < 0) {
            if (current.getLeft() == null) {
                current.setLeft(new Node<>(value));
                size++;
            } else {
                insertRecursive(current.getLeft(), value);
            }
        } else if (cmp > 0) {
            if (current.getRight() == null) {
                current.setRight(new Node<>(value));
                size++;
            } else {
                insertRecursive(current.getRight(), value);
            }
        }
    }

    @Override
    public void addAll(List<T> values) {
        if( values == null)
            return;
        for (T value: values)
            addValue(value);
    }

    @Override
    public HashSet<T> getValues(T inf, T sup) {
        HashSet<T> result = new HashSet<>();
        collectValuesInRange(root, inf, sup, result);
        return result;
    }

    private void collectValuesInRange(Node<T> current, T inf, T sup, HashSet<T> result) {
        if (current == null)
            return;

        if (current.getValue().compareTo(inf) > 0)
            collectValuesInRange(current.getLeft(), inf, sup, result);

        if (current.getValue().compareTo(inf) >= 0 &&
                current.getValue().compareTo(sup) <= 0)
            result.add(current.getValue());

        if (current.getValue().compareTo(sup) < 0)
            collectValuesInRange(current.getRight(), inf, sup, result);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}

class Student implements Comparable<Student> {
    private final Float grade;

    public Student(Float grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student student) {
        return this.grade.compareTo(student.grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                '}';
    }
}

public class Main {

    private static Integer testNr = 0;

    public static void main(String[] args) {

        final Tree<Student> tree = new TreeImpl<>();
        final List<Student> studentList = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            studentList.add(createGenericStudent((float) i));
        }

        printTestNr(); // 1
        System.out.println(tree.isEmpty());
        System.out.println(tree.size());
        System.out.println();

        printTestNr(); // 2
        for (int i = 0; i < 5; i++) {
            tree.addValue(createGenericStudent((float) i));
        }
        System.out.println(tree.size());
        System.out.println();

        printTestNr(); // 3
        tree.addAll(studentList);
        System.out.println(tree.isEmpty());
        System.out.println(tree.size());
        System.out.println();

        printTestNr(); // 4
        final Student studentThatPassedExam = new Student(5.0f);
        final Student studentThatWorkedHardToPassTheExam = new Student(10.0f);
        final HashSet<Student> values = tree.getValues(studentThatPassedExam, studentThatWorkedHardToPassTheExam);
        System.out.println(values.size());
        values.stream().sorted().forEach(System.out::println);
    }

    private static void printTestNr() {
        System.out.println("TEST " + ++testNr + " result:");
    }

    private static Student createGenericStudent(final Float grade) {
        return new Student(grade);
    }
}