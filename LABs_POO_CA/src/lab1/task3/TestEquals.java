package lab1.task3;

public class TestEquals {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Gigel");
        s1.setGrade(9.5);

        Student s2 = new Student();
        s2.setName("Gigel");
        s2.setGrade(9.5);

        System.out.println(s1.equals(s2));
        //se va afisa false pt ca obiectele nu indica catre aceeasi soza
        //pentru a afisa true decomenteaza rescrierea metodei in functia Student
    }
}
