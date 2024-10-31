// Static Keyword
//The static keyword in Java is mainly used for memory management. The static keyword in Java is used to share the same variable or method of a given class. It is used for a constant variable or a method that is the same for every instance of a class.


// Static Variable
// When a variable is declared as static, then a single copy of the variable is created and shared among all objects at the class level. Static variables are, essentially, global variables. All instances of the class share the same static variable.


package Java_OOPs.OneStatic;

class Mobile
{
    String brand;
    static String type;
    int price;

    public void Show()
    {
        System.out.println("Brand : "+brand+"\tType : "+type+"\tPrice : "+price);
    }    
}

public class OneStaticVar
{
    public static void main(String[] args) {
        
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 140000;
        // m1.type = "Smartphone";

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 120000;
        // m2.type = "Smartphone";

        Mobile.type = "Phones";

        m1.Show();
        m2.Show();
       
    }
}