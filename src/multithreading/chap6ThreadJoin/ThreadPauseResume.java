package multithreading.chap6ThreadJoin;

public class ThreadPauseResume {
    public static void main(String args[]) throws InterruptedException {
        CustomThread customThread=new CustomThread();
        customThread.start();
        //here we wait for custom thread to complete in 3000 ms
        //so that we can set exit and exit the thread
        Thread.sleep(3000);
        if(customThread.isAlive())
        {
            customThread.setShouldExit(true);
            customThread.join();
        }
        System.exit(0);
        /*
        In this chapter, we will talk about properly closing a thread.
        The built-in method Thread.stop() is deprecated and we should
         implement our own method for closing a thread properly. It is really
         important that we properly close a thread, especially if the thread does
         work on things that can lead to data loss, data inconsistency etc.
         In this chapter, we will look into a method where we make use of a flag to
         properly stop a thread if needed.
         */
    }
}
