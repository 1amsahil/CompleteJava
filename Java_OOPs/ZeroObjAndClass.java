// Class :- 
// A class in Java is a set of objects which shares common characteristics/ behavior and common properties/ attributes. It is a user-defined blueprint or prototype from which objects are created. For example, Student is a class while a particular student named Ravi is an object.

// * Properties of Java Classes
// - Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.
// - Class does not occupy memory.
// - Class is a group of variables of different data types and a group of methods.
// - A Class in Java can contain:
//     1. Data member
//     2. Method
//     3. Constructor
//     4. Nested Class
//     5. Interface

// Object :- 
// An object in Java represents real-world entities. Objects are the instances of a class that are created to use the attributes and methods of a class.  A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of :

// State : It is represented by attributes of an object. It also reflects the properties of an object.
// Behavior : It is represented by the methods of an object. It also reflects the response of an object with other objects.
// Identity : It gives a unique name to an object and enables one object to interact with other objects.

// Instance variable in Java :
// A variable which is created inside the class but outside the method is known as an instance variable. Instance variable doesn't get memory at compile time. It gets memory at runtime when an object or instance is created. That is why it is known as an instance variable.

// Method in Java :
// In Java, a method is like a function which is used to expose the behavior of an object.

// New keyword in Java :
// The new keyword is used to allocate memory at runtime. All objects get memory in Heap memory area.


package Java_OOPs;

class Calculator
{
    public int add(int x , int y)
    {
        int result = x+y;
        return result;
    }
}

public class ZeroObjAndClass
{
    public static void main(String[] args)
    {
        int num1 = 5;    
        int num2 = 10;

        Calculator cal = new Calculator();

        int result = cal.add(num1 , num2);
        
        System.out.println(result);
        
    }
}