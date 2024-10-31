// Enum :-
// In Java,Enumerations or Java Enum serve the purpose of representing a group of named constants in a programming language. Java Enums are used when we know all possible values at compile time, such as choices on a menu, rounding modes, command-line flags, etc.

// A Java enumeration is a class type. Although we don’t need to instantiate an enum using new, it has the same capabilities as other classes.


package Java_Adv.FourEnum;

enum Status
{
    Running, Pending, Success, Failed 
}

public class Enum {
    public static void main(String[] args) {
        
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] ss = Status.values();

        for(Status i : ss)
        {
            System.out.println(i);
        }
    }
}
