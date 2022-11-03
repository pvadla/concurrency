package creatingthread;

public class ThreadUsingLambda {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " running");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(threadName + " finished");


        };

        Thread thread1 = new Thread(runnable, "The Thread 1");
        thread1.start();
    }
}
