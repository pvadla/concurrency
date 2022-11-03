package creatingthread;

public class MyThreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("My thread in runnable started");
        System.out.println("My thread in runnable finished");

    }
}
