package multithreading.chap5ThreadStatusAndJoin;

public class CalculateRunnable implements Runnable{
    long value;

    CalculateRunnable(long value){
        this.value=value;
    }

    @Override
    public void run(){
        long startTime=System.currentTimeMillis();
        long sum=0;
        for(long i=0;i<value;i++)
        {
            sum+=i;
        }
        long timeTaken=System.currentTimeMillis()-startTime;
        System.out.println("Elapsed Time : "+timeTaken+" for thread: "+Thread.currentThread().getName());
    }
}
