package lab5.task3;

public class Test {
    public static void main(String[] args) {
        Operation op = new Operation(0);

        op.plus( (float)5.3);
        op.minus((float)4.2);
        op.div((float)0.2);
        op.mult((float)2);
        System.out.println("Numarul este: " + op.getNumber());
    }
}
