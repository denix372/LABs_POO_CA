package lab4;

public class Employee {
    private String name;
    private double salary;
    private int age;

    public Employee(){
        name = "";
        salary = 0;
        age = 0;
    }

    public Employee(String name, double salary, int age){
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double calculateBonus(){
        return salary * 0.05;
    }

    public String validateEmployee(){
        if(salary < 0)
            return "Salary cannot be negative.";
        else if(age < 18)
            return "Employee age must be 18 or older.";
        else return "Employee is valid.";
    }

    public void showDetails(){
        System.out.println("Employee details: ");
    }

    public int compareSalary(Employee employee){
        if(this.salary > employee.salary)
            return 1;
        else if(this.salary == employee.salary)
            return 0;
        else return -1;

    }

    @Override
    public String toString() {
        //Name: `name`, Salary: `salary`, Age: `age`
        return "Name: " + name + ", Salary: " + salary + ", Age: " + age;
    }

}
