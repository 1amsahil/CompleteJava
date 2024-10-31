// Final variables:- 
// When a variable is declared as final, its value cannot be changed once it has been initialized. This is useful for declaring constants or other values that should not be modified.
package Java_OOPs.Final;

public class FinalKeyword {
    public static void main(String[] args) {
        
        final int val = 20;
        // val = 30; // we can't change final variable after initialisation  
        System.out.println(val);
    }
}
