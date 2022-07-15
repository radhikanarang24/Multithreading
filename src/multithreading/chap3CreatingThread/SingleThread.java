package multithreading.chap3CreatingThread;

public class SingleThread {
    public static void main(String[] args) {
        createJavaThread();
        createJavaFxThread();
    }

    private static void createJavaThread(){
        JavaThreadTest javaThreadTest = new JavaThreadTest();
        Thread th=new Thread(javaThreadTest);
        th.setName("JAVA_THREAD");
        th.start();
    }

    private static void createJavaFxThread(){
        new JavaFxThreadTest().start();
    }
}
