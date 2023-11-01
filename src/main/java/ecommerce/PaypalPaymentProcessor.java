package ecommerce;

public class PaypalPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing paypal payment of $"+ amount);
        // Logic for processing payment through internal credit system
    }
}
