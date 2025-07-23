package lab4;

public class Manager extends Employee{
    private int nr_employees;

    public Manager(){
        super();
    }
    public Manager(String name, double salary, int age){
        super(name,salary,age);
    }

    public Manager(String name, double salary, int age, int nr_employees){
        super(name,salary,age);
        this.nr_employees = nr_employees;
    }

    public int getNr_employees() {
        return nr_employees;
    }

    public void setNr_employees(int nr_employees) {
        this.nr_employees = nr_employees;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + ", Salary: " + super.getSalary() + ", Age: " + super.getAge() + " [Position: Manager]";
    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.2;
    }

    public double calculateBonus(int bonus) {
        return getSalary()*0.2 + bonus*nr_employees;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee details: Manager of " + nr_employees + " employees.");
    }

    @Override
    public String validateEmployee() {
        if(nr_employees < 1)
            return "Number of employees managed must be 1 or greater.";
            else return "Manager is valid.";
    }
}
