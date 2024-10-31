package Java_Adv.EightException;

class EternalException extends Exception
{

    public EternalException(String msg)
    {
        super(msg);
    }
}

public class ThreeCustomExcep {
    public static void main(String[] args) {
        
        int i = 15;
        int j = 0;

        try{
            j = 10/i;

            if(j == 0)
            {
                throw new EternalException("Numnber must be greater than or equals to 15");
            }
        }
        catch(EternalException e){
            
            System.out.println("Your Calculation Gives Zero : "+e);
        }
        
        // - Also Worked
        // catch(Exception e)
        // {
        //     System.out.println("Your Calculation Gives Zero : "+e);
        // }
    }
}
