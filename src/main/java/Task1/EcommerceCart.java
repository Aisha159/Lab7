package Task1;

public class EcommerceCart {

    private PaymentMethod paymentMethod;

    public EcommerceCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        boolean success = paymentMethod.pay(amount);

        if (success) {
            System.out.println("Checkout successful!");
        } else {
            System.out.println("Payment failed!");
        }
    }
}