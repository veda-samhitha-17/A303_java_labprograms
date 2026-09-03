class CounterThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(1000); // 1-second delay (1000 milliseconds)
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
public class TaskManagerApp {
    public static void main(String[] args) {
        CounterThread counter = new CounterThread();
        counter.start();
    }
}