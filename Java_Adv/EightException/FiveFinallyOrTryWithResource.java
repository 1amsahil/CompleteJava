// Finally Keyword :-
// The finally keyword is used in association with a try/catch block and guarantees that a section of code will be executed, even if an exception is thrown.
// Java finally block is a block used to execute important code such as closing the connection, etc.


package Java_Adv.EightException;

import java.util.Scanner;

public class FiveFinallyOrTryWithResource {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        int j = 0;
        
        try(Scanner sc = new Scanner(System.in);
        )
        {
            int i = sc.nextInt();
            j = i/j;
        }

        catch(Exception e)
        {
            System.out.println(e);
        }

        // finally
        // {
        //     System.out.println("Always Print !");
        //     sc.close();
        // }
    }
}
