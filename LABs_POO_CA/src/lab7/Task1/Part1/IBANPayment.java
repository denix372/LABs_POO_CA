package lab7.Task1.Part1;

public class IBANPayment implements PaymentStrategy{

    private String IBAN;

    public IBANPayment(String IBAN) {
        this.IBAN = IBAN;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with IBAN");
    }
}
