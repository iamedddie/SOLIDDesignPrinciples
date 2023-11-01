package ecommerce;

public class TextNotifier implements CustomerNotifier {
    @Override
    public void notifyCustomer() {
        System.out.println("New Text notification: Order confirmed");
    }
}
