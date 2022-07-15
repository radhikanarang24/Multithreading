package multithreading.chap11ThreadPoolExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args)
    {
        ThreadPoolExample threadPoolExample=new ThreadPoolExample();
        threadPoolExample.start();

    }

    private void start(){
        //newSingleThreadExecutor initializes only single thread in threadpool
        //ExecutorService executorService= Executors.newSingleThreadExecutor();

        //newFixedThreadpool to 4 and 4 threads were initialized.
        //ExecutorService executorService= Executors.newFixedThreadPool(4);


        //newCacheThreadPool - JVM takes care of no of threads to be created in threadpool
        // depending on no of tasks. So here it created 6 threads
        ExecutorService executorService=Executors.newCachedThreadPool();

        WorkTask task1 = new WorkTask("Task-1");
        WorkTask task2 = new WorkTask("Task-2");
        WorkTask task3 = new WorkTask("Task-3");
        WorkTask task4 = new WorkTask("Task-4");
        WorkTask task5 = new WorkTask("Task-5");
        WorkTask task6 = new WorkTask("Task-6");

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);
        executorService.submit(task5);
        executorService.submit(task6);

    }
}
