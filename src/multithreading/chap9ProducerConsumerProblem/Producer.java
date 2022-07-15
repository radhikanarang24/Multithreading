package multithreading.chap9ProducerConsumerProblem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread{
    private static final int MAX_SIZE=4;
    private final List<String> messages = new ArrayList<>();

    @Override
    public void run(){
        try{
            while(true) {
                produce();
                //Thread.sleep(20);
            }
        }
        catch (Exception ex){

        }
    }

    private synchronized void produce() throws Exception{
        while(messages.size()==MAX_SIZE)
        {
            wait();
        }
        String date = LocalDateTime.now().toString();
        messages.add(date);
        System.out.println("Producer produced data");
        notify();
    }

    public synchronized String consume() throws Exception{
        notify();
        while(messages.isEmpty())
        {
            wait();
        }
        String data = messages.get(0);
        messages.remove(data);
        return data;
    }
}
