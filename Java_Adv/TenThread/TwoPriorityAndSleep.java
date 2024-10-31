package Java_Adv.TenThread;


class Bike extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Driving Bike");
            
            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(""+e);
            }
        } 
    }
}

class Car extends Thread
{
    public void run()
    { 
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Driving Car");
        } 
    }
}

public class TwoPriorityAndSleep {
    public static void main(String[] args) {
        
        Bike B = new Bike();
        Car C = new Car();
        
        B.setPriority(7);
        C.setPriority(Thread.MAX_PRIORITY);
        
        System.out.println(B.getPriority());
        System.out.println(C.getPriority());

        
        B.start();
        C.start();
    }
}
