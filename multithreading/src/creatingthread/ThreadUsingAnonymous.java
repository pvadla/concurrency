package creatingthread;

public class ThreadUsingAnonymous {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable using anonynos started");
                System.out.println("Runnable using anonymous finished");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
