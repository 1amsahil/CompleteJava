package Java_Adv.ThirteenStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student
{
    String name;

    Student()
    {

    }
    Student( String name )
    {
        this.name = name;
    }
    public String toString() {
        return name+" ";
    }
}

public class SevenConstructorReference {
    public static void main(String[] args)
    {
        List<String> listName = Arrays.asList("Nadeem","Adeeb","Obaid","Nawaz","Kaif","Ashad");
        List<Student> stName = new ArrayList<>();

        // for(String str : listName)
        // {
        //     stName.add(new Student(str));
        // }


        // Stream Form :-

        // stName = listName.stream()
        //                 .map(name -> new Student(name))
        //                 .toList();

        
        // Constructor Reference
        stName = listName.stream()
                        .map(Student :: new)
                        .toList();

        System.out.println(stName);
    }
}
