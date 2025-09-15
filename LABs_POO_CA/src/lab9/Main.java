package lab9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskId = scanner.nextInt();
        scanner.close();

        /* Do not modify */
        Student s1 = new Student("Maria", "Popescu", 3, 8.5);
        Student s2 = new Student("Ion", "Grigorescu", 2, 8);
        Student s3 = new Student("Ana", "Enescu", 7, 7);
        Student s4 = new Student("Mihai", "Eminovici", 1, 4.45);
        Student s5 = new Student("Andrei", "Radu", 12, 2);

        List<Student> students = new ArrayList<>(List.of(s1, s2, s3, s4, s5));
        List<Student> copyStudents = new ArrayList<>(students);
        List<Student> anotherCopyStudents = new ArrayList<>(students);

        List<Integer> numbers = List.of(10, 20, 5, 243, 5556, 312, 566, 245, 122, 5556, 5, 10, 20, 122);
        ArrayList<String> subjects = new ArrayList<>(List.of("PP", "PA", "PCOM", "IOCLA", "AA",
                "SO", "CPL", "EP", "RL", "LFA"));
        Random random = new Random(12);
        /* End of unmodifiable zone */

        switch (taskId) {
            /* ------------------------- Task 1 ------------------------- */
            /* --------- Sort using Comparable<Student> interface ------- */
            case 1:
                Collections.sort(students);
                System.out.println(students);
                break;
            /* ------------------------- Task 2 ------------------------- */
            /* -------------- Sort using a lambda expression ------------ */
            case 2:
                copyStudents.sort((sA, sB) -> {
                    int cmp = sA.getName().compareTo(sB.getName());
                    if (cmp != 0) return cmp;
                    return sA.getSurname().compareTo(sB.getSurname());
                });

                System.out.println(copyStudents);
                break;
            /* ------------------------- Task 3 ------------------------- */
            /* ----------- Implement your priority queue here ----------- */
            /* --------------- Use Comparator.comparing() --------------- */
            case 3:
                PriorityQueue<Student> queueById = new PriorityQueue<>(
                        (st1, st2) -> Long.compare(st1.getId(), st2.getId())
                );

                queueById.addAll(copyStudents);

                for (Student s : queueById) {
                    System.out.println(s);
                }
                break;

            /* ------------------------- Task 4 ------------------------- */
            case 4:
                Map<Student, LinkedList<String>> studentMap = new HashMap<>();
                students.forEach(s -> studentMap.putIfAbsent(s, new LinkedList<>()));
                /*----Add 4 random elements from subjects array in each LinkedList ----*/
                /*
                 * As index use the previously declared random object and use subjects.size() as
                 * your
                 * bound. Use addFirst() method to add elements in the LinkedList
                 */

                for (Map.Entry<Student, LinkedList<String>> entry: studentMap.entrySet()) {
                    LinkedList<String> list = entry.getValue();
                    for(int i = 0; i < 4; i++) {
                        String subject = subjects.get(random.nextInt(subjects.size()));
                        list.addFirst(subject);
                    }
                }

                System.out.println(studentMap);
                break;
            /* ------------------------- Task 5 ------------------------- */
            /* ------------- No need to add or modify here -------------- */
            case 5:
                System.out.println(numbers);
                LinkedEvenSet linked = new LinkedEvenSet();
                linked.addAll(numbers);

                EvenSet set = new EvenSet();
                set.addAll(numbers);

                TreeEvenSet tree = new TreeEvenSet();
                tree.addAll(numbers);

                System.out.println(linked);
                System.out.println(set);
                System.out.println(tree);
            default:
                break;
        }

    }
}

class Student implements Comparable<Student> {
    /* ------------------------- Task 1 ------------------------- */
    /* Add student properties */
    /* Generate getters and setters */
    private String name, surname;
    private long id;
    private double averageGrade;

    public Student(String name, String surname, long id, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student {name=" + name + ", surname=" + surname + ", id=" + id + ", averageGrade=" + averageGrade + "}";
    }

    @Override
    public int compareTo(Student o) {
        int gradeCompare = Double.compare(this.averageGrade, o.averageGrade);
        if (gradeCompare != 0) return gradeCompare;

        int nameCompare = this.name.compareTo(o.name);
        if (nameCompare != 0) return nameCompare;

        return this.surname.compareTo(o.surname);
    }


    /* ------------------------- Task 4 ------------------------- */
    /* Override `equals` and `hashCode` methods */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.averageGrade, averageGrade) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, averageGrade);
    }

}

class EvenSet extends HashSet<Integer> {
    /* Task 5 - Make it that it only accepts even Integers */

    @Override
    public boolean add(Integer integer) {
        if(integer % 2 == 0 )
            return super.add(integer);
        return false;
    }
}

class LinkedEvenSet extends LinkedHashSet<Integer> {
    /* Task 5 - Make it that it only accepts even Integers */

    @Override
    public boolean add(Integer integer) {
        if(integer % 2 == 0)
            return super.add(integer);
        return false;
    }
}

class TreeEvenSet extends TreeSet<Integer> {
    /* Task 5 - Make it that it only accepts even Integers */

    @Override
    public boolean add(Integer integer) {
        if(integer % 2 == 0)
            return super.add(integer);
        return false;
    }
}