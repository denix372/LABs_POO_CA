package lab1.exemple;

public class MyClass {
    int a = 100; // a este un membru al clasei MyClass, putem face direct initializarea aici

    void doStuff() {
        System.out.println("folosim println in metoda");
        a++;
        for (int i = 0; i < 10; i++) {
            a += 2;
            System.out.println("punem for in metoda " + a);
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(); // creezi un obiect
        obj.doStuff(); // apelez metoda doStuff pe acel obiect

    }
}