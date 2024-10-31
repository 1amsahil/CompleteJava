// Lambda Expression :-
// Lambda expressions in Java, introduced in Java SE 8, represent instances of functional interfaces (interfaces with a single abstract method). They provide a concise way to express instances of single-method interfaces using a block of code.

package Java_Adv.SevenLambdaExp;

@FunctionalInterface
interface Vehicle
{
    public void drive();
}

public class OneLambdaExp {
    public static void main(String[] args) {
        
        // - Normal Code

        // Vehicle car = new Vehicle()
        // {
        //     public void drive()
        //     {
        //         System.out.println("Driving Car");
        //     }
        // };

        // - In Term of Lambda Expression

        // Vehicle bike = () ->
        //     {
        //         System.out.println("Driving Bike");
        //     };

        // - Modified Lambda Expression

        Vehicle bike = () -> System.out.println("Driving Bike");

        bike.drive();

    }
}
