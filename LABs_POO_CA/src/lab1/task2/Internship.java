package lab1.task2;
import java.util.Random;

public class Internship {
    String name;
    double minGrade;
    Student[] students;

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