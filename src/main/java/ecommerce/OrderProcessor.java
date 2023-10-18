package ecommerce;

import discountStrategy.Order;

public class OrderProcessor {
    private CreditPaymentProcessor paymentProcessor;
    private UserOrderNotifier notifier;

    public OrderProcessor() {
        this.paymentProcessor = new CreditPaymentProcessor();
        this.notifier = new UserOrderNotifier();
    }

    public void processOrder(Order order) {
        paymentProcessor.processPayment(order.getTotalAmount());
        notifier.notifyUserOrderConfirmed();
    }
}
