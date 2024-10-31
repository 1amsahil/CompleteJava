package Java_Adv.TenThread;

class Counter
{
    int count;
    public synchronized void increment()
    {
        count++;
    } 
}

public class FourMutation {
    public static void main(String[] args)
    {
        Counter c = new Counter();

        System.out.println("Start : ");
        
        Runnable obj1 = () ->
        {
            for(int i = 1; i<=10000; i++)
            {
                c.increment();
            }
        };
        
        Runnable obj2 = () ->
        {
            for(int i = 1; i<=10000; i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }

        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println(c.count);

    }
}
