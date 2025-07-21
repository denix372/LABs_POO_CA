package lab1.task4;
import java.util.Random;

public class Internship {
    private String name;
    private double minGrade;
    private Student[] students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(double minGrade) {
        this.minGrade = minGrade;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student chooseCandidateRandomly() {
        Random rand = new Random();
        int index = rand.nextInt(students.length);
        return students[index];
    }

    public void chooseCandidatesForInterview() {
        for (int i = 0; i < students.length; i++)
            if (students[i].getGrade() >= minGrade) {
                System.out.println("Candidate " + students[i].getName() + " got a phone interview at " + name);
            }
    }
}