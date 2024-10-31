
// Encapsulation in Java : 
// It is a mechanism of wrapping the data (variables/ data members) and code acting on the data (i.e methods) together as a single unit.

// In Encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of its own class in which it is declared.


package Java_OOPs.ThreeEncapsulation;
class Human
{
    private String name ;
    private int age;
    
    public String GetterN()
    {
        return name;
    }
    public int GetterA()
    {
        return age;
    }
    
    public void Setter(String n ,int a)
    {
        name = n;
        age = a; 
    }
}

public class OneEncapsulation
{
    public static void main(String[] args) {
        
        Human h1 = new Human();
        h1.Setter("Sahil", 24);
        
        Human h2 = new Human();
        h2.Setter("Eternity", 24);
        
        System.out.println("Name : "+h1.GetterN()+"\tAge : "+h1.GetterA());
        System.out.println("Name : "+h2.GetterN()+"\tAge : "+h2.GetterA());
        
    }
}