// Method Overloading
// Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.

package Java_OOPs;

class Book
{
    void content()
    {
        System.out.println("Chapter 1");
        System.out.println("Chapter 2");
        System.out.println("Chapter 3");
        System.out.println("Chapter 4");
        System.out.println("Chapter 5");
    }

    void content(int number)
    {
        System.out.println("Chapter "+number);
        System.out.println(number+".1");
        System.out.println(number+".2");
    }

    String content(int chapter, int part)
    {
        return "Chapter : "+chapter+" Part : "+part+" Harry Potter";
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Book hp = new Book();
        hp.content();
        hp.content(4);
        System.out.println(hp.content(3, 4));
    }
}
