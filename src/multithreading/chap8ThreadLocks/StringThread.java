package multithreading.chap8ThreadLocks;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class StringThread extends Thread{
    private List<Character> names;
    private String word;
    private static ReentrantLock lock = new ReentrantLock();

    public StringThread(List<Character> names, String word)
    {
        this.names=names;
        this.word=word;
    }

    @Override
    public void run(){
        lock.lock();
        System.out.println("lock acquired "+lock.getHoldCount());
        try {
                for (int i = 0; i < word.length(); i++) {
                    try {
                        names.add(word.charAt(i));
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.println(names);
            }
        finally {
            lock.unlock();
            System.out.println("lock released "+lock.getHoldCount());
        }
    }
}
