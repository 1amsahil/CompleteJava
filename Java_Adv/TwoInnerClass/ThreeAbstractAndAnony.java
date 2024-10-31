package Java_Adv.TwoInnerClass;

abstract class Display
{
    abstract public void show();
}

public class ThreeAbstractAndAnony {
    
    public static void main(String[] args) {
        
        Display obj = new Display()
        {
            public void show()
            {
                System.out.println("Inside a show");
            }
        };

        obj.show();
    }
}
