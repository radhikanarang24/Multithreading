package multithreading;

public class EvenOddThread {
    int counter = 1;
    static int N;

    public static void main(String[] args)
    {
        N=10;
        EvenOddThread thread= new EvenOddThread();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                thread.printEven();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                thread.printOdd();
            }
        });

        t1.start();
        t2.start();
    }

    public void printEven()
    {
        synchronized (this)
        {
            while(counter<N)
            {
                while(counter%2==1)
                {
                    try{
                        wait();
                        //System.out.println("waiting in print even method");
                    }
                    catch (InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                }

                System.out.println(counter+" ");
                counter++;
                notify();
            }
        }
    }

    public void printOdd(){
        synchronized (this){
            while(counter<N)
            {
                while(counter%2==0)
                {
                    try{
                        wait();
                        //System.out.println("waiting in print odd method");
                    }
                    catch (InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                }

                System.out.println(counter+" ");
                counter++;
                notify();
            }
        }
    }
}
