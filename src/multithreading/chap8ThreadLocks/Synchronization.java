package multithreading.chap8ThreadLocks;

import multithreading.chap7ThreadSynchronization.StringReverseThread;

import java.util.ArrayList;
import java.util.List;

public class Synchronization {
    public static void main(String[] args) throws InterruptedException
    {
        List<Character> list = new ArrayList<>();
        Thread thread1 = new StringThread(new ArrayList<>(),"HELLO");
        thread1.start();

        Thread thread2 = new StringReverseThread(new ArrayList<>(),"WORLD");
        thread2.start();

        Thread thread3 = new StringReverseThread(list,"THERE");
        thread3.start();

        Thread thread4 = new StringReverseThread(list,"VOILA");
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
    }
}
