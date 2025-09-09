package lab7.Task1.Part2;

public class Person implements BalanceObserver{
    private String name, surname;
    private int balance, limit;

    public Person(String name, String surname, int balance, int limit) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.limit = limit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void update() {
        System.out.println(name + " " + surname
                + ", ramai fara bani, saracule!" );
    }

    public boolean payBy(int amount) {

        if ( balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println(name + " " + surname + ", pleaca de aici, saracule!");
            return false;
        }
    }
}
