package ecommerce;


public class Main {

    public static void main(String[] args) {
        PaymentProcessor credit = new CreditPaymentProcessor();
        CustomerNotifier email = new EmailNotifier();
        PaymentProcessor paypal = new PaypalPaymentProcessor();
        CustomerNotifier text = new TextNotifier();
//        OrderProcessor processor1 = new OrderProcessor(credit,email);
//        OrderProcessor processor2 = new OrderProcessor(paypal,text);
//
//        processor1.processOrder(new NewOrder( 10000));
//        processor2.processOrder(new NewOrder(60000));
        NewOrder newOrder1 = new NewOrder(10000,email,paypal);
        NewOrder newOrder2 = new NewOrder(20000,text,credit);
        OrderProcessor processor = new OrderProcessor(newOrder1);
        processor.processOrder();

    }
}
