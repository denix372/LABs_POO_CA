package lab1.task2_list;
import java.util.ArrayList;
import java.util.List;


public class JobMarket {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student();
        s1.setName("Gigel");
        s1.setGrade(9.1);

        Student s2 = new Student();
        s2.setName("Dorel");
        s2.setGrade(7.8);

        Student s3 = new Student();
        s3.setName("Marcel");
        s3.setGrade(8.3);

        Student s4 = new Student();
        s4.setName("Ionel");
        s4.setGrade(9.5);

        // adăugăm în ArrayList
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        Internship[] internships = new Internship[4];

        internships[0] = new Internship();
        internships[0].name = "Google";
        internships[0].minGrade = 8.5;
        internships[0].students = students;

        internships[1] = new Internship();
        internships[1].name = "Amazon";
        internships[1].minGrade = 8.0;
        internships[1].students = students;

        internships[2] = new Internship();
        internships[2].name = "Facebook";
        internships[2].minGrade = 9.0;
        internships[2].students = students;

        internships[3] = new Internship();
        internships[3].name = "Microsoft";
        internships[3].minGrade = 8.0;
        internships[3].students = students;

        for (int i = 0; i < internships.length; i++) {
            internships[i].chooseCandidatesForInterview();
        }
    }
}
