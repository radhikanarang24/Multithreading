package multithreading.chap3CreatingThread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaFxThreadTest extends Thread{

    public JavaFxThreadTest(){
        setName("JAVA_FX_THREAD");
    }

    @Override
    public void run(){
        System.out.println("Starting thread name : "+Thread.currentThread().getName());
        try{
            for(int i=0;i<10;i++) {
                System.out.println("JavaFX");
                Thread.sleep(200);
            }
        }
        catch (InterruptedException ex)
        {
            Logger.getLogger(JavaFxThreadTest.class.getName()).log(Level.SEVERE,null,ex);
        }
        System.out.println("Thread completed : "+Thread.currentThread().getName());

    }
}
