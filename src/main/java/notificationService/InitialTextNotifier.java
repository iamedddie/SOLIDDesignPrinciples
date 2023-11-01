package notificationService;

public class InitialTextNotifier implements Notifier {
    Notification notification;



    public void send(String message) {
        System.out.println("New Text Notification; "+ message);
    }
}
