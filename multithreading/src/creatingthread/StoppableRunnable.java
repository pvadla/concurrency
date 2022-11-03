package creatingthread;

public class StoppableRunnable implements Runnable{

    boolean isStopRequested = false;

    public boolean isStopRequested(){
        return isStopRequested;
    }

    public void requestStop(){
        isStopRequested = true;
    }


    public static void sleep(long millisecs){
        try {
            Thread.sleep(millisecs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void run() {
        while(!isStopRequested()){
            sleep(1000);
            System.out.println("...");
        }
        System.out.println("Stopped runnable thread");
    }

    public static void main(String[] args) throws InterruptedException {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable);

        thread.start();
        Thread.sleep(3000);
        System.out.println("Requesting stop");
        stoppableRunnable.requestStop();
        System.out.println("Stopped request");

    }
}
