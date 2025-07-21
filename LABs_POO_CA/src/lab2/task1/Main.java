package lab2.task1;

public class Main {
    public static void main(String[] args) {
        Complex c = new Complex();
        c.showNumber();

        c.setReal(3);
        c.setImaginary(4);

        Complex c2 = new Complex(c);
        c2.showNumber();

        Complex c3 = new Complex(2,-8);

        c3.addWithComplex(c2);
        c3.showNumber();

    }
}
