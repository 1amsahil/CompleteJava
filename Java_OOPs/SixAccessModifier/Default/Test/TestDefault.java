package Java_OOPs.SixAccessModifier.Default.Test;
import Java_OOPs.SixAccessModifier.Default.Default;


class Subclass extends Default
{
    public void show()
    {
        // System.out.println(defaultValue); // Default Neither used as a Subclass
    }
}

public class TestDefault {
    public static void main(String[] args) {
        
        // System.out.println(new Default().defaultValue); // Default can't be used in Different package
    }
}
