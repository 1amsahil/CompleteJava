// Interface :-
// Interfaces are used to implement abstraction. 
// An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).
// We use the interface keyword to create an interface in Java. 
// All variables and methods in an interface are declared as public. It contains abstract methods only. All variables are static and final.

package Java_Adv.ThreeInterface;

interface A
{
    int age = 24;  // variable are final And static
    String name = "Sahil"; 

    public void show(); // methods are abstract
    public void info();
}
class B implements A
{
    public void show()
    {
        System.out.println("Inside show");
    }
    public void info()
    {
        System.out.println("Inside info");
    }
}

abstract class Vehicle 
{
    abstract public void car(); 
}

public class Basic {
    public static void main(String[] args) {
        A obj;
        obj = new B();

        obj.show();
        obj.info();

        System.out.println("Name : " +A.name+ " Age :" +A.age);

        Vehicle newObj = new Vehicle() {
            public void car()
            {
                System.out.println("Inside Anonymous car");
            }
        };

        newObj.car();
    }
}
