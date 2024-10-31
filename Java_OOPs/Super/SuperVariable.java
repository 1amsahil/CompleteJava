// Super Variable
// We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.

package Java_OOPs.Super;

class Vehicle
{
    int speed = 150;

    void show()
    {
        System.out.println("Speed : "+speed);
    }
} 

class Bike extends Vehicle
{
    int speed = 100;
    
    void show()
    {
        System.out.println("Speed : "+speed);
    }

    void showVehicle()
    {
        System.out.println("Speed : "+super.speed);
    }
}

public class SuperVariable
{
    public static void main(String[] args)
    {
        Bike Yamaha = new Bike();
        Yamaha.showVehicle();
        Yamaha.show();
    }
}