package creatingthread;

public class DaemonThread {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            while(true){
                sleep(1000);
                System.out.println("Running");
            }
        };

        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        sleep(2000);

    }


    public static void sleep(long millisecs){
        try {
            Thread.sleep(millisecs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
