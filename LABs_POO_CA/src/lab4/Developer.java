package lab4;

public class Developer extends Employee{
    private int nr_projects;

    public Developer(){
        super();
    }

    public Developer(String name, double salary, int age){
        super(name,salary,age);
    }

    public Developer(String name, double salary, int age, int nr_projects){
        super(name,salary,age);
        this.nr_projects = nr_projects;
    }

    public int getNr_projects() {
        return nr_projects;
    }

    public void setNr_projects(int nr_projects) {
        this.nr_projects = nr_projects;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + ", Salary: " + super.getSalary() + ", Age: " + super.getAge() + " [Position: Developer]";
    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.15;
    }

    public double calculateBonus(int bonus) {
        return getSalary()*0.15 + bonus*nr_projects;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee details: Developer with " + nr_projects + " Y projects.");
    }

    @Override
    public String validateEmployee() {
        if( nr_projects < 1)
            return "Number of projects must be 1 or greater.";
        else return "Developer is valid.";
    }
}
