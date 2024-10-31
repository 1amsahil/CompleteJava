// This Keyword
// The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.

package Java_OOPs.This;

class Vehicle
{
    private String name;
    private int power;

    public void setName(String name)
    {
        this.name = name;
    }
    public void getName()
    {
        System.out.println("Name : "+name+"\tPower : "+power);
    }

    public void Engine(Vehicle obj, int power)
    {
        obj.power = power;
    }

}

public class ThisKeyword {
    public static void main(String[] args) {
        
        Vehicle tvs = new Vehicle();

        tvs.setName("Apache");
        tvs.Engine(tvs, 200);
        tvs.getName();

    }
}
