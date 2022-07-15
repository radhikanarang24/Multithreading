package multithreading.chap6ThreadJoin;

public class CustomThread extends Thread{
    private boolean shouldExit=false;

    public void setShouldExit(boolean shouldExit)
    {
        this.shouldExit=shouldExit;
    }

    @Override
    public void run(){
        try{
            for(int i=0;i<10;i++)
            {
                if(shouldExit)
                    break;
                System.out.println("thread is running");
                Thread.sleep(20);
            }
            System.out.println("thread is completed");
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
