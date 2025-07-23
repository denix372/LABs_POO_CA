package lab4;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Anne", 2500, 25);
        Employee e2 = new Employee("Abby", -22, 2);
        Manager m1 = new Manager("Mike", 3000, 30, 3);
        Manager m2 = new Manager("Molly", 3000, 30, 0);
        Developer d1 = new Developer("David", 2000, 20, 2);
        Developer d2 = new Developer("Daniel", -1, 2, 0);

        System.out.println(e1);
        System.out.println(e1.validateEmployee());
        System.out.println("Employee1 has a bonus of " + e1.calculateBonus());

        System.out.println(e2);
        System.out.println(e2.validateEmployee() + "\n");

        System.out.println(m1);
        System.out.println(m1.validateEmployee());
        System.out.println("Manager1 has a bonus of " + m1.calculateBonus(4));

        System.out.println(m2);
        System.out.println(m2.validateEmployee() + "\n");

        System.out.println(d1);
        System.out.println(d1.validateEmployee());
        System.out.println("Developer1 has a bonus of " + d1.calculateBonus());

        System.out.println(d2);
        System.out.println(d2.validateEmployee() + "\n");

        if(e1.compareSalary(e2) > 0)
            System.out.println(e1.getName() + " has a higher salary");
        else if(e1.compareSalary(e2) == 0)
            System.out.println("Both employees have the same salary");
        else System.out.println(e2.getName() + " has a higher salary");

    }
}
