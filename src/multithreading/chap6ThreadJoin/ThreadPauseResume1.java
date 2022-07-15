package multithreading.chap6ThreadJoin;

public class ThreadPauseResume1 {
    public static void main(String args[]) throws InterruptedException {
        CustomThread customThread=new CustomThread();
        customThread.start();

        int maxSleep=3000;
        int slept = 0;
        while(slept<maxSleep)
        {
            Thread.sleep(300);
            slept+=300;
            if(!customThread.isAlive())
            {
                System.out.println("thread was completed within 3 secs");
                System.exit(0);
            }
        }

        if(customThread.isAlive())
        {
            customThread.setShouldExit(true);
            customThread.join();
        }

        System.exit(0);
//If customThread completes in less than 3 seconds, we can exit the main thread in this way
    }
}
