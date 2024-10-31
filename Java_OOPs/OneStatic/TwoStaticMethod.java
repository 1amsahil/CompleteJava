// Static Method
// Static Method can access only Static data or other Static methods.

package Java_OOPs.OneStatic;

class Vehicle
{
    String name;
    int price;
    static String type;

    public static void Show()
    {
        System.out.println("Type : "+type);
    }

    // Eg : we use only 'type' variable because it is static type in Show()

    public static void Show(Vehicle obj)
    {
        System.out.println("Name : "+obj.name+"Price : "+obj.price+"Type : "+type);
    }
    // Important :-
    // We can access Non-Static data in Static Function by using Arguments. Eg : Above Code
}

public class TwoStaticMethod {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        car1.name = "lambo";
        car1.price = 100000;
        // car1.type = "Sports Car";
        Vehicle.type = "Sports Car";

        Vehicle car2 = new Vehicle();
        car2.name = "Ferrari";
        car2.price = 150000;
        // car2.type = "Sports Car";
        Vehicle.type = "Sports Car";

        Vehicle.Show();
        
        Vehicle.Show(car1);
        Vehicle.Show(car2);

    }
}
