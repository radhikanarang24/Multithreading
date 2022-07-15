package multithreading.chap3CreatingThread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaThreadTest implements Runnable{

    @Override
    public void run(){
        System.out.println("Starting thread name: "+Thread.currentThread().getName());
        try{
            for(int i=0;i<10;i++)
            {
                System.out.println("Java");
                Thread.sleep(200);
            }
        }
        catch (InterruptedException ex){
            Logger.getLogger(multithreading.chap2ThreadUsingRunnable.JavaThreadTest.class.getName()).log(Level.SEVERE,null,ex);
        }
        System.out.println("Thread completed : "+Thread.currentThread().getName());

    }
}
