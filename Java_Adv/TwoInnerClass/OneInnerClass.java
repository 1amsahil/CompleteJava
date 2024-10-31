// Inner Class
// Java inner class or nested class is a class that is declared inside the class or interface.

package Java_Adv.TwoInnerClass;

class A
{
    int age;
    public void show()
    {
        System.out.println("In show");
    }

    class B
    {
        void config()
        {
            System.out.println("In config");
        }
    }
}

public class OneInnerClass {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();

        // A.B object = obj.new B();
        A.B object = new A().new B();
        object.config();
    }
}
