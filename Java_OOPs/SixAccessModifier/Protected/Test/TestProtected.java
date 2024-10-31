package Java_OOPs.SixAccessModifier.Protected.Test;
import Java_OOPs.SixAccessModifier.Protected.Protected;

class Subclass extends Protected
{
    public void func()
    {
        System.out.println(protectedValue);
    }
}

public class TestProtected {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        Protected obj = new Protected(); 
        // System.out.println(obj.protectedValue); // We can use Protected in the other package as a Subclass
    }
}
