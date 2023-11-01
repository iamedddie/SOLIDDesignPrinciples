package ecommerce;

import discountStrategy.Order;

public class OrderProcessor {

    private PaymentProcessor processor;
    private CustomerNotifier customerNotifier;
    private double totalAmount;


    //    public OrderProcessor(PaymentProcessor processor, CustomerNotifier customerNotifier) {
//        this.processor = processor;
//        this.customerNotifier = customerNotifier;
//    }
    public OrderProcessor(NewOrder order) {
        this.processor = order.getProcessor();
        this.customerNotifier = order.getNotifier();
        this.totalAmount= order.getTotalAmount();
    }

    public void processOrder() {
        processor.processPayment(this.totalAmount);
        customerNotifier.notifyCustomer();
    }
}
