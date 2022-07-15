package multithreading.chap10DaemonThread;

public class NonDaemonThreadProblem {
    public static void main(String args[])
    {
        new Thread(()->{
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
        }).start();

        System.out.println("Expecting shutdown now");
       System.exit(0);//If you cant use daemon thread and you have to exit the main program you can use system.exit() to exit the program. It kills all the running threads and exits

    }
}
