// Inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class. In addition, you can add new fields and methods to your current class as well. 

package Java_OOPs.FourInheritance;

class Calc
{
    public int add(int a, int b)
    {
        return a+b;
    }

    public int sub(int a , int b)
    {
        return a-b;
    }
}

class AdvCalc extends Calc // Single Inheritence
{
    public int mul(int a, int b)
    {
        return a*b;
    }

    public int div(int a, int b)
    {
        return a/b;
    }
} 

class SciCalc extends AdvCalc // Multi-Level Inheritence
{
    public double pow(int a , int b)
    {
        return Math.pow(a,b);
    }

    public double sqrt(int a)
    {
        return Math.sqrt((double)a);
    }

}

class AiCalc extends AdvCalc // Hierarchical Inheritance
{
    public double per(double numOfSub, double markGain)
    {
        return markGain/numOfSub;
    }
}

public class Basic {
    public static void main(String[] args) {
        
        AdvCalc ac = new AdvCalc();
        
        System.out.println("\nInheritence\n");
        System.out.println( "Addition : "+ac.add(4,6) );
        System.out.println( "Subtraction : "+ac.sub(9,6) );
        System.out.println( "Multiplication : "+ac.mul(4,3) );
        System.out.println( "Division : "+ac.div(24,6) );
        
        SciCalc sc = new SciCalc();
        
        System.out.println("\nMulti-Level Inheritence\n");
        System.out.println( "Addition : "+sc.add(4,6) );
        System.out.println( "Subtraction : "+sc.sub(9,6) );
        System.out.println( "Multiplication : "+sc.mul(4,3) );
        System.out.println( "Division : "+sc.div(24,6) );
        System.out.println( "Power : "+sc.pow(24,2) );
        System.out.println( "SquareRoot : "+sc.sqrt(16) );

        AiCalc ic = new AiCalc();
        System.out.println("Percentage : "+ ic.per(8, 621));
        System.out.println("Addition : "+ ic.add(5, 6));
        

    }
}
