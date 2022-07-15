package multithreading.ScheduledThreadPoolExecutor;

import javax.swing.*;
import java.awt.desktop.SystemEventListener;
import java.util.Calendar;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorExample {

    public static void main(String[] args)
    {
        System.out.println("count down clock program counting from 10 to 0");
        ScheduledThreadPoolExecutor executor= (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(12);
        System.out.println("Current Time : "+ Calendar.getInstance().get(Calendar.SECOND));

        for(int i=10;i>=0;i--)
        {
            executor.schedule(new Task(i),10-i, TimeUnit.SECONDS);
        }
        //executor.schedule(new Task(300),30, TimeUnit.SECONDS);
        executor.shutdown();
    }

    static class Task implements Runnable{
        private int num;
        public Task(int num){this.num=num;}
        public void run(){
            System.out.println("Number "+num+" Current Time: "+Calendar.getInstance().get(Calendar.SECOND));
        }
    }
}
