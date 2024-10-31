// Abstract Class :- 
// Java abstract class is a class that can not be initiated by itself, it needs to be subclassed by another class to use its properties. An abstract class is declared using the “abstract” keyword in its class definition.

package Java_Adv.OneAbstract;

abstract class Vehicle // Abstract Class
{
    public abstract void drive(); // Abstract Method

    String name;
    int speed;
}

class Car extends Vehicle
{
    public void drive()
    {
        System.out.println("Driving");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        new Vehicle() {
            public void drive() {
                
            }
        };
        
        Car wagon = new Car();
        
        wagon.name = "Mercedes G Wagon";
        wagon.speed = 110;
        
        wagon.drive();
        System.out.println(wagon.speed+"kmph "+wagon.name);

    }
}
