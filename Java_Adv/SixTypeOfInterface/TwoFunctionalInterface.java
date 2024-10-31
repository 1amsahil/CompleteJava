//  Functional Interface:
// - Functional Interface is an interface that has only pure one abstract method.
// - It can have any number of static and default methods and also even public methods of java.lang.Object classes

package Java_Adv.SixTypeOfInterface;

@FunctionalInterface
interface A
{
    public void show();
}

public class TwoFunctionalInterface {
    public static void main(String[] args) {
        
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in Show");
            }
        };

        obj.show();
    }
}
