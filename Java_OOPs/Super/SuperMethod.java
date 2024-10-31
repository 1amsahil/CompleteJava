// Super Method
// The super keyword can also be used to access the parent class constructor. One more important thing is that ‘super’ can call both parametric as well as non-parametric constructors depending on the situation.
package Java_OOPs.Super;

class A
{
    A()
    {
        System.out.println("Inside Constructor A");
    }

    A(int n)
    {
        System.out.println("Inside Para Constructor A");
    }
}

class B extends A
{
    B()
    {
        super(4);
        System.out.println("Inside Constructor B");
    }
    
    B(int x )
    {
        super();
        System.out.println("Inside Para Constructor B");
    }
}
public class SuperMethod {
    public static void main(String[] args)
    {     
        new B();
        new B(3);
    }
}
