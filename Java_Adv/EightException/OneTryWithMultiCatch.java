// try :- 
// The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.

// catch :-
// The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

package Java_Adv.EightException;

public class OneTryWithMultiCatch {
    public static void main(String[] args) {
        
        int i = 16;
        int nums[] = new int[5];

        try
        {
            System.out.println(i/2);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot Divide by Zero : "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Cannot Access the index, It is Out of Limit : "+e);
        }

        System.out.println("End");
    }
}
