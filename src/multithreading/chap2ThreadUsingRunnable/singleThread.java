package multithreading.chap2ThreadUsingRunnable;

public class singleThread {
    public static void main(String[] args) throws InterruptedException {
        createJavaThread();
        for(int i=0;i<10;i++)
        {
            System.out.println("main thread here!");
            Thread.sleep(200);
        }
    }

    private static void createJavaThread(){
        JavaThreadTest javaThreadTest=new JavaThreadTest();
        Thread th=new Thread(javaThreadTest);
        th.setName("JAVA_THREAD");
        th.start();
    }

}
