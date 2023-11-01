package ecommerce;

import notificationService.Notifier;

public class EmailNotifier implements CustomerNotifier {
    @Override
    public void notifyCustomer() {
        System.out.println("New Email notification: Order confirmed");
    }
}
