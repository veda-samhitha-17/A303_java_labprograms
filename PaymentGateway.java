class PaymentProcessor implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Payment Processing... (" + i + ")");
            try {
                Thread.sleep(500); // Optional slight delay for realistic output
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class PaymentGateway{
    public static void main(String[] args) {
        // Create Runnable object and pass it to a Thread
        PaymentProcessor paymentTask = new PaymentProcessor();
        Thread paymentThread = new Thread(paymentTask);

        paymentThread.start();
    }
}