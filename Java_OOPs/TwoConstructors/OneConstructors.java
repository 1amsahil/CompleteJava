// Constructor :
// Constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling the constructor, memory for the object is allocated in the memory. It is a special type of method that is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called.

// Default Constructor :
// A constructor that has no parameters is known as default the constructor. A default constructor is invisible. And if we write a constructor with no arguments, the compiler does not create a default constructor. 

package Java_OOPs.TwoConstructors;

class Human
{
    String name;
    int age;

    Human()
    {
        name = "Sahil";
        age = 24;
    }
    
    public void show()
    {
        System.out.println("Name : "+name+"\tAge : "+age);
    }
}

public class OneConstructors {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.show();
    }
}
