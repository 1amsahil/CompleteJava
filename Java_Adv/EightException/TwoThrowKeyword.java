// throw :-
// The "throw" keyword is used to throw an exception.
package Java_Adv.EightException;

public class TwoThrowKeyword {
    public static void main(String[] args) {
        
        int num = 5;
        int val = 0;
        try
        {
            val = 2/num;

            if(val == 0)
            {
                throw new ArithmeticException("Number must be greater than 5");
            }
        }

        catch(Exception e)
        {
            val = 15/num;
            System.out.println("Default Value Prints : "+e);
        }

        System.out.println(val);
    }
}
