package multithreading.chap5ThreadStatusAndJoin;

public class ThreadStatus {
    public static void main(String args[]) throws InterruptedException {
        Thread th = new Thread();
        CalculateRunnable calculateRunnable=new CalculateRunnable(30000000L);

        Thread thread=new Thread(calculateRunnable);
        thread.setName("high priority");
        thread.start();

        //To check if a thread is alive, we use thread.isAlive() method
       /* while(thread.isAlive())
        {
            System.out.println("thread is active");
            Thread.sleep(100);
        }

        System.out.println("thread is completed");*/

        //System.exit causes the main thread to exit without waiting for other thread to complete its execution
        //System.exit(0);

        //Thread.join makes the main thread wait for other thread to complete its execution and then exit the system
        //thread.join();

        //Thread.join(millisecs) -> to ask the main thread to wait for other thread for max for specified millisecs
        thread.join(10);
        System.exit(0);
    }

}
