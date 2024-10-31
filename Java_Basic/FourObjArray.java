package Java_Basic;

class Student 
{
    int roll_no;
    String name;
    char sec;
}

public class FourObjArray
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "Sahil";
        s1.roll_no = 161;
        s1.sec = 'C';

        Student s2 = new Student();
        s2.name = "Nadeem";
        s2.roll_no = 169;
        s2.sec = 'C';

        Student  s3 = new Student();
        s3.name = "Obaid";
        s3.roll_no = 172;
        s3.sec = 'C';

        Student s[] = new Student[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;

        for(int i = 0; i<s.length; i++)
        {
            System.out.println("Name : "+s[i].name+"\nRoll Number :"+s[i].roll_no+"\nSection : "+s[i].sec);
            System.out.println();
        }

        for(Student i :s)
        {
            System.out.println("Name : "+i.name+"\nRoll Number :"+i.roll_no+"\nSection : "+i.sec);
            System.out.println();
        }
    }
}
