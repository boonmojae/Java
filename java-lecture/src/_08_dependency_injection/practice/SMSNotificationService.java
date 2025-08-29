package _08_dependency_injection.practice;

public class SMSNotificationService implements NotificationService{

    public void send() {
        System.out.println("Sending SMS notification: Your order ha been processed");
    }
}
