package ecommerce;

public class CreditPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $"+ amount);
        // Logic for processing payment through internal credit system
    }
}
