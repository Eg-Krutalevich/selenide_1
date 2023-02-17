package exceptions;

public class TimeOut {
    public static void threadSleep() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Exception!");
        }
    }
}
