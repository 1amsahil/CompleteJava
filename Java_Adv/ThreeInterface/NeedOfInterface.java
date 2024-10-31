package Java_Adv.ThreeInterface;

interface Computer
{
    void coding();
}

class Desktop implements Computer
{
    public void coding()
    {
        System.out.println("Code Compile Run ... faster");
    }
}

class Laptop implements Computer
{
    public void coding()
    {
        System.out.println("Code Compile Run...");
    }
}

class Developer
{
    public void devApp(Computer obj)
    {
        obj.coding();
    }
}

public class NeedOfInterface {
    
    @SuppressWarnings("unused")

    public static void main(String[] args) {
        
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer sahil = new Developer();
        sahil.devApp(desk);
    }
}
