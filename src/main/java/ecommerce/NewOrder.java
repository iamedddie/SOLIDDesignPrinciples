package ecommerce;

public class NewOrder {

    private double totalAmount;
    private CustomerNotifier notifier;
    private PaymentProcessor processor;

    public CustomerNotifier getNotifier() {
        return notifier;
    }

    public PaymentProcessor getProcessor() {
        return processor;
    }

    public NewOrder(double totalAmount, CustomerNotifier notifier, PaymentProcessor processor) {
        this.totalAmount = totalAmount;
        this.notifier = notifier;
        this.processor = processor;
    }

//    public NewOrder(double totalAmount) {
//
//        this.totalAmount= totalAmount;
//    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
