package multithreading.chap1Intro;

public class mainThread {
    public static void main(String args[]) throws InterruptedException {
        Thread th=Thread.currentThread();
        System.out.println("current thread: "+th.getName());
        Thread.sleep(200);
        th.setName("new_thread");
        System.out.println("current thread: "+th.getName());
    }

}