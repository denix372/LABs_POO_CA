package lab7.Task1.Part1;

public class CardPayment implements PaymentStrategy{

    private String name, cardNumber, cvv, dateOfExpiry;

    public CardPayment(String name, String cardNumber, String cvv,
                       String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}
