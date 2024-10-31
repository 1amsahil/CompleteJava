package Java_Adv;

class A
{
    public void show()
    {
        System.out.println("Inside A class");
    }
}

class B extends A
{
    @Override
    public void show()
    {
        System.out.println("Inside B class");
    }
}

public class FiveAnnotation {
    public static void main(String[] args) 
    {   
        B obj = new B();
        obj.show();
    }
}
