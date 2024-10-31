package Java_OOPs;

class Laptop
{
    int price;
    String model;

    public String toString() // toString Method
    {
        return "Model : "+model+"  Price : "+price;
    }

    public boolean equals(Laptop obj)
    {
        if( (this.model == obj.model) && (this.price == obj.price) )
        return true;
        
        else
        return false;
    }
}

public class TwoObjToStringHashcode
{
    public static void main(String[] args)
    {
        Laptop obj1 = new Laptop();
        Laptop obj2 = new Laptop();

        obj1.model = "HP Victus";
        obj1.price = 1000;

        obj2.model = "HP Victus";
        obj2.price = 999;

        // System.out.println(obj1.toString()); 

        System.out.println(obj1);   // Object called the toString Method implicitly
        System.out.println(obj2);
        
        System.out.println("Are They Both the Laptop Same : "+obj1.equals(obj2));
    }
}