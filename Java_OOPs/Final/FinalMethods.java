// Final methods:-
//  When a method is declared as final, it cannot be overridden by a subclass. This is useful for methods that are part of a class’s public API and should not be modified by subclasses.

package Java_OOPs.Final;

class Cal
{
    public final void show()
    {
        System.out.println("By Sahil");
    }
}
class AdvCal extends Cal
{
    // final Method stops the Method Overriding.
    
    // public void show()    
    // {
    //     System.out.println("By Eternity");
    // }
}
public class FinalMethods {
    public static void main(String[] args) {
        
    }
}
