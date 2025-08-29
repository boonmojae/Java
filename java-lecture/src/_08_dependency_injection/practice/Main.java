package _08_dependency_injection.practice;

public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        OrderService orderService1 = new OrderService(emailService);
        orderService1.processOrder();

        System.out.println("-------------------------------------");

        NotificationService smsService = new SMSNotificationService();
        OrderService orderService2 = new OrderService();
        orderService2.setNotificationService(smsService);
        orderService2.processOrder();
    }
}