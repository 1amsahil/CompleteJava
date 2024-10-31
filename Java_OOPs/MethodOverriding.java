// Method Overriding :-
// When a method in a subclass has the same name, the same parameters or signature, and the same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class

package Java_OOPs;
class A 
{
    public void show()
    {
        System.out.println("Class A ");
    }
}
class B extends A
{
    
    public void show()
    {
        System.out.println("Class B ");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
