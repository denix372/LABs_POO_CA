package lab1.task3;

public class Student {
    String name;
    double grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // pentru a nu afisa false va trebui sa suprascriem metoda eguals
    /*
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student other = (Student) obj;
        return name.equals(other.name) && grade == other.grade;
    }
     */

}
