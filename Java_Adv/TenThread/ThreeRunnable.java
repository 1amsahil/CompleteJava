package Java_Adv.TenThread;

class C1 implements Runnable
{
    public void run()
    {
        for(int i = 1; i<=5; i++)
        {
            System.out.println("First");
            try
            {
                Thread.sleep(2);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

class C2 implements Runnable
{
    public void run()
    {
        for(int i = 1; i<=5; i++)
        {
            System.out.println("Second");
        }
    }
}

public class ThreeRunnable {
    public static void main(String[] args)
    {
        Runnable obj1 = () ->
            {
                for(int i = 1; i<=5; i++)
                {
                    System.out.println("First");
                    try
                    {
                        Thread.sleep(2);
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                }
            };

        Runnable obj2 = new C2();

        Thread t1 = new Thread(obj1);
        t1.start();

        Thread t2 = new Thread(obj2);
        t2.start();
    }
}
