package lab7.Task1.Part2;

import java.util.ArrayList;
import java.util.List;

public class Shop implements TransactionPublisher {
    private List<BalanceObserver> observers = new ArrayList<>();

    public void addObserver(BalanceObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notify(Person person) {
        person.update();
    }

    public void createTransaction (Person person, int amount) {
        boolean success = person.payBy(amount);
        if ( success && person.getBalance() < person.getLimit())
            notify(person);
    }
}
