package Task1;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        System.out.println("Payment made using Credit Card: Rs. " + amount);
        return true;
    }
}