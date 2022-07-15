package multithreading.chap7ThreadSynchronization;

import java.util.List;

public class StringReverseThread extends Thread{
    private List<Character> names;
    private String word;

    public StringReverseThread(List<Character> names, String word)
    {
        this.names=names;
        this.word=word;
    }

    @Override
    public void run(){
        synchronized (names) {
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
    }

}
