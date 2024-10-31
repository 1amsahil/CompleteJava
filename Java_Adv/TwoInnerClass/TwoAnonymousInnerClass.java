// Anonymous Inner Class: It is a class that is defined inline and has no name. It is used to implement interfaces or extend classes without creating a separate class. It should be used if you have to override a method of class or interface.

package Java_Adv.TwoInnerClass;

class Monitor
{
    public void show()
    {
        System.out.println("Inside the Show");
    }
}

public class TwoAnonymousInnerClass {
    public static void main(String[] args)
    {
        // Anonymous Inner Class
        Monitor obj = new Monitor(){
            public void show()
            {
                System.out.println("Inside the new Show");
            }
        };

        obj.show();
    }
}
