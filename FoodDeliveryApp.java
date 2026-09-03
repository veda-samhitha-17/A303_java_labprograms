class OrderPlacement extends Thread {
    @Override
    public void run() {
        System.out.println("Order Placement: Order received and placed!");
        try {
            Thread.sleep(1000); // Simulate processing time
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Order Placement: Order details sent to restaurant.");
    }
}
class OrderDelivery extends Thread {
    @Override
    public void run() {
        System.out.println("Order Delivery: Delivery partner assigned.");
        try {
            Thread.sleep(1500); // Simulate delivery time
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Order Delivery: Order successfully delivered!");
    }
}
public class FoodDeliveryApp {
    public static void main(String[] args) {
        OrderPlacement placementThread = new OrderPlacement();
        OrderDelivery deliveryThread = new OrderDelivery();
        placementThread.start();
        deliveryThread.start();
    }
}