
package multithreading.chap10DaemonThread;

public class DaemonThread {
    public static void main(String args[])
    {
        Thread th = new Thread(()->{
            while (true)
            {
                try{
                    Thread.sleep(3000);
                    System.out.println("hello");

                }
                catch(InterruptedException ex)
                {

                }
            }
        });

        th.setDaemon(true);
        th.start();

        System.out.println("Expecting shutdown now");
    }
}
