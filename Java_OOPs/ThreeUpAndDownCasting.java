package Java_OOPs;

class One
{
    public void showA()
    {
        System.out.println("Inside One");
    }
}

class Two extends One
{
    public void showB()
    {
        System.out.println("Inside Two");
    }
}

public class ThreeUpAndDownCasting
{
    public static void main(String[] args)
    {
        One obj1 = new Two();  // Upcasting :- Child Class to Parent Class
        obj1.showA();  

        Two obj2 = (Two)obj1; // Downcasting :- Parent Class to Child Class
        obj2.showB();
    }
}
