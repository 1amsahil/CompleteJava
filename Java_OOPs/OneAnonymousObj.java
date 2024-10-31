// Anonymous Object
// Anonymous Object in Java means creating an object without any reference variable. An anonymous object is basically a value that has been created but has no name. It is created by using "new" Keyword.

package Java_OOPs;

class Student
{
    Student()
    {
        System.out.println("Inside Constructor");
    }
    public void show()
    {
        System.out.println("Hello, World !");
    }
}
public class OneAnonymousObj {
    public static void main(String[] args) {

        new Student().show(); // Anonymous Object

    }
}
