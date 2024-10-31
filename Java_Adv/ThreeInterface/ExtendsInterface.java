package Java_Adv.ThreeInterface;

interface InterA
{
    void info();
}

interface InterB 
{
    void config();
}

interface InterC extends InterB
{

}

class X implements InterA,InterC
{
    public void info()
    {
        System.out.println("Information");
    }
    public void config()
    {
        System.out.println("Configuration");
    }
}


public class ExtendsInterface {
    public static void main(String[] args) {
        X obj = new X();
        
        obj.info();
        obj.config();
    }
}
