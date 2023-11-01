package notificationService;

public class InitialEmailNotifier   implements Notifier {
    Notification notification;



    public void send(String message) {
        System.out.println("New Email Notification; "+ message);
    }
}
