package creatingthread;

public class MyThreadRunnableDemo {
    public static void main(String[] args) {
        //passing new runnable to thread

        Thread thread = new Thread(new MyThreadRunnable());
        thread.start();
    }
}
