package _08_dependency_injection.practice;

public class EmailNotificationService implements NotificationService{

    public void send() {
        System.out.println("Sending mail notification: Your order ha been processed");
    }
}
