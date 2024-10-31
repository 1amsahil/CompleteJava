// Static Block :
// If you need to do the computation in order to initialize your static variables, you can declare a static block that gets executed exactly once, when the class is first loaded by the class loader.

package Java_OOPs.OneStatic;

class SBlock
{
    static int a = 10;
    static int b;

    SBlock()
    {
        System.out.println("Inside the Constructor");
    }

    static
    {
        System.out.println("Inside the Static block");
    }
}

public class ThreeStaticBlock {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        SBlock obj1 = new SBlock();
        SBlock obj2 = new SBlock();
    }
}
