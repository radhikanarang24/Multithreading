package multithreading.ThreadPoolExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {
    public static void main(String[] args)
    {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();

        //Stats before execution
        System.out.println("Largest executions: " + executor.getLargestPoolSize());
        System.out.println("Maximum allowed threads: " + executor.getMaximumPoolSize());
        System.out.println("Current threads in pool: " + executor.getPoolSize());
        System.out.println("Currently executing threads: " + executor.getActiveCount());
        System.out.println("Total number of threads(ever scheduled): " + executor.getTaskCount());

        executor.submit(new Task());
        executor.submit(new Task());

        //Stats after execution
        System.out.println("Largest executions: " + executor.getLargestPoolSize());
        System.out.println("Maximum allowed threads: " + executor.getMaximumPoolSize());
        System.out.println("Current threads in pool: " + executor.getPoolSize());
        System.out.println("Currently executing threads: " + executor.getActiveCount());
        System.out.println("Total number of threads(ever scheduled): " + executor.getTaskCount());

        executor.shutdown();
    }

    static class Task implements Runnable{
        public void run(){
            try{
                Long duration = (long)Math.random()*5;
                System.out.println("Running Task! Thread Name : "+Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(duration);
                System.out.println("Task completed! Thread Name : "+Thread.currentThread().getName());
            }
            catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
