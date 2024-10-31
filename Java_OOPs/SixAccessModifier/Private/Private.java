package Java_OOPs.SixAccessModifier.Private;

class PrivateClass
{
    private int privateValue = 20;
    public void Getter()
    {
        System.out.println(privateValue);
    }
}

public class Private 
{
    public static void main(String[] args)
    {
        PrivateClass obj = new PrivateClass();
        obj.Getter();
    }
}

