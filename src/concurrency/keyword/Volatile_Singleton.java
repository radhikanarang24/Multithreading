package concurrency.keyword;

public class Volatile_Singleton
{
    private static volatile Volatile_Singleton instance;

    public static Volatile_Singleton getInstance()
    {
        if(instance==null)
        {
            synchronized (Volatile_Singleton.class)
            {
                if(instance==null)
                    instance=new Volatile_Singleton();
            }
        }

        return instance;
    }

}
