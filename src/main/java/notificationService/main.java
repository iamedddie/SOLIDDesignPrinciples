package notificationService;


public class main {

    public static void main(String[] args) {

        InitialUserNotificationService service;
        service = new InitialUserNotificationService(new InitialTextNotifier());

        service.notifyUser(new TextNotification("Hi"));




    }
}
