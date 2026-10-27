package Task1;

public class JazzCashPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        System.out.println("Payment made using JazzCash: Rs. " + amount);
        return true;
    }
}