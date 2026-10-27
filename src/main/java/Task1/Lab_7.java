/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Task1;

import Task1.JazzCashPayment;
import Task1.EcommerceCart;
import Task1.CreditCardPayment;

/**
 *
 * @author aisha
 */
public class Lab_7 {

    public static void main(String[] args) {

    PaymentMethod p1 = new CreditCardPayment();

    EcommerceCart cart1 = new EcommerceCart(p1);
    cart1.checkout(2000);

    System.out.println();

    PaymentMethod p2 = new JazzCashPayment();

    EcommerceCart cart2 = new EcommerceCart(p2);
    cart2.checkout(1500);
}
}
