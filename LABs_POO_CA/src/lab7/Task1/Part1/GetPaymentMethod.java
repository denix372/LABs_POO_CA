package lab7.Task1.Part1;

import java.util.Random;

public class GetPaymentMethod {
    public static PaymentStrategy getPaymentMethod(Client client) {
        int choice = new Random().nextInt(3);
        switch (choice) {
            case 0:
                return new VoucherPayment("ABC123");
            case 1:
                return new IBANPayment("RO49AAAA1B31007593840000");
            case 2:
                return new CardPayment("Denis", "1234-5678-9012-3456", "123", "12/25");
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}
