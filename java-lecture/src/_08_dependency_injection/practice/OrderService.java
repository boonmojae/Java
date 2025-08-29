package _08_dependency_injection.practice;

public class OrderService {

    private NotificationService notificationService;

    // 생성자
    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public OrderService() {}

    // setter
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder() {
        System.out.println("Order processed successfully");
        notificationService.send();
    }
}