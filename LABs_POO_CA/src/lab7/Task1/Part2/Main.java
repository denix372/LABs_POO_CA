package lab7.Task1.Part2;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Denis", "Popescu", 50, 30);
        Shop shop = new Shop();

        shop.addObserver(p);

        shop.createTransaction(p, 25);
        shop.createTransaction(p, 30);
    }
}
