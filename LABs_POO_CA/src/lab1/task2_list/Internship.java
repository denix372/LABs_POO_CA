package lab1.task2_list;
import java.util.List;
import java.util.Random;

public class Internship {
    String name;
    double minGrade;
    List<Student> students;

    public Student chooseCandidateRandomly() {
        Random rand = new Random();
        int index = rand.nextInt(students.size());
        return students.get(index);
    }

    public void chooseCandidatesForInterview() {
        for (int i = 0; i < students.size(); i++)
            if ( students.get(i).getGrade() >= minGrade) {
                System.out.println("Candidate " +  students.get(i).getName() + " got a phone interview at " + name);
            }
    }


}