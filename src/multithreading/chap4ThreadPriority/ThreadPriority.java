package multithreading.chap4ThreadPriority;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread th=new Thread();
        CalculateRunnable calculateRunnable=new CalculateRunnable(30000000000L);

        Thread thread1=new Thread(calculateRunnable);
        thread1.setName("THREAD 1 - HIGH");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();

        Thread thread2=new Thread(calculateRunnable);
        thread2.setName("THREAD 2 - LOW");
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
    }
}
