package creatingthread;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
           for(int i = 0; i < 5; i++){
               System.out.println("Hello");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        //adding join to wait until they complete
        t1.join();
        t2.join();

        System.out.println("Bye");


    }
}
