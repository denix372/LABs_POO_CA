package lab7.Task1.Part1;

public class VoucherPayment implements PaymentStrategy{

    String code;

    public VoucherPayment(String code){
        this.code = code;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with voucher");
    }
}
