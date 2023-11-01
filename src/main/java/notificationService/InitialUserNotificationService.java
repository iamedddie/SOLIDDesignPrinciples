package notificationService;

public class InitialUserNotificationService {

    private Notifier notifier;


    public InitialUserNotificationService(Notifier notifier) {
        this.notifier = notifier;
    }


    public void notifyUser(Notification notification) {
        notifier.send(notification.getMessage());
    }
}
