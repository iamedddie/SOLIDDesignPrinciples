package notificationService;

public class InitialUserNotificationService {
    private InitialEmailNotifier emailNotifier;

    public InitialUserNotificationService() {
        this.emailNotifier = new InitialEmailNotifier();
    }

    public void notifyUser(String message) {
        emailNotifier.send(message);
    }
}
