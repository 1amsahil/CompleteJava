// Parametrized Constructors
// A constructor that has parameters is known as parameterized constructor. If we want to initialize fields of the class with our own values, then use a parameterized constructor.

package Java_OOPs.TwoConstructors;

class Student
{
    private String name;
    private int age;

    Student(int age , String name)
    {
        this.age = age;
        this.name = name;

    }

    public void show()
    {
        System.out.println("Name : "+name+"\tAge : "+age);
    }
}

public class TwoConstructors {
    
    public static void main(String[] args) {
        Student obj = new Student(24, "Sahil");
        obj.show();
    }
}
