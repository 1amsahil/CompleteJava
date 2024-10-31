package Java_Adv.TwelveComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;

    public Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public String toString()
    {
        return "Name : "+name+" Age : "+age;
    }
}

public class TwoObjComparator {
    public static void main(String[] args) {
        
        Comparator<Student> comp = new Comparator<Student>() {
            public int compare(Student s1 , Student s2)
            {
                if(s1.age> s2.age)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };

        List<Student> list = new ArrayList<>();

        list.add( new Student(23, "xyz") );
        list.add( new Student(20, "abc") );
        list.add( new Student(18, "pqr") );
        list.add( new Student(22, "mno") );

        Collections.sort(list,comp);

        System.out.println(list);
    }
}
