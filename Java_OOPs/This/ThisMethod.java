// This Method 
// The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.

package Java_OOPs.This;

class A
{
    A()
    {
        System.out.println("Default Constructor A");    
    }

    A(int x)
    {
        System.out.println("Parametrized Constructor A");
    }
}

class B extends A
{
    int val = 10;
    B()
    {
        super(5);
        System.out.println("Default Constructor B");
    }
    B(int x)
    {
        this();
        System.out.println("Parametrized Constructor B");
    }
}

public class ThisMethod {
    public static void main(String[] args) {

        new B(9);
        
    }
}
