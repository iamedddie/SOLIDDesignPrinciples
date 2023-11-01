package notificationService;

public class EmailNotification extends Notification {


    public EmailNotification(String message) {
        super(message);
    }


    public String getMessage() {
        return super.message;
    }
}
  
