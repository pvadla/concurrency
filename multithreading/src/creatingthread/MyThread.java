package creatingthread;

public class MyThread extends Thread{
    public void run(){
        System.out.println("My Thread running");
        System.out.println("My Thread finished");
    }
}
