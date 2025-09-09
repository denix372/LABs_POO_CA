package lab7.Task1.Part1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Denis");
        PaymentStrategy payment = GetPaymentMethod.getPaymentMethod(client);
        payment.pay(10);
    }
}
