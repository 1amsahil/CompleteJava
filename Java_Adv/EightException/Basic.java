// What are Java Exceptions ?
// In Java, Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program’s instructions.

// Exception Handling :-
// The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.

// Errors :-
// Errors represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory, memory leaks, stack overflow errors, library incompatibility, infinite recursion, etc. Errors are usually beyond the control of the programmer, and we should not try to handle errors.

// Exceptions can be categorized in two ways:

// 1.) Built-in Exceptions :-
//      a.) Checked Exception
//      b.) Unchecked Exception 
// 2.) User-Defined Exceptions :-

// 1. Built-in Exceptions
// Built-in exceptions are the exceptions that are available in Java libraries. These exceptions are suitable to explain certain error situations.

// a.) Checked Exceptions: Checked exceptions are called compile-time exceptions because these exceptions are checked at compile-time by the compiler.
 
// b.) Unchecked Exceptions: The unchecked exceptions are just opposite to the checked exceptions. The compiler will not check these exceptions at compile time, but they are checked at runtime.The classes that inherit the RuntimeException are known as unchecked exceptions.

package Java_Adv.EightException;

public class Basic {
    public static void main(String[] args) {
        
        int i = 0;
        int j = 0;
        
        try
        {
            j = 12/i;
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong..." +e);
        }

        System.out.println(j);
    }
}
