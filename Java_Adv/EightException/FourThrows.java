package Java_Adv.EightException;

class House 
{
    public void show() throws Exception
    {
        Class.forName("Java_Adv.EightException.TwoThrowKeyword");
        System.out.println("Show() Successfully Executed!");
    }

    public int room(int a , int b) throws Exception
    {
        return a*b;
    }
}

public class FourThrows {
    static
    {
        System.out.println("Class Loader");
    }

    public static void main(String[] args) {
        
        House obj = new House();

        int val = 0; 
        try
        {
            obj.show();
            if( (val = obj.room(2,0)) == 0 || val ==1)
            {
                throw new Exception("values of \"a\" and \"b\" can't be zero or one");
            } 
              
        }
        catch( Exception e)
        {
            System.out.println(val+" : "+e);
            e.getStackTrace();
        }

        System.out.println("END");
    }
}
