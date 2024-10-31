package Java_Adv.TwelveComparatorVsComparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Vehicle implements Comparable<Vehicle>
{
    String name;
    int power;

    public Vehicle(String name, int power)
    {
        this.name = name;
        this.power = power;
    }

    public String toString()
    {
        return "Name : "+name+" | Power : "+power;
    }

    public int compareTo(Vehicle obj)
    {
        if(this.power > obj.power)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

public class ThreeComparable {
    public static void main(String[] args)
    {
        ArrayList<Vehicle> list = new ArrayList<>();
        list.add( new Vehicle("Nissan_SkyLine",730));
        list.add( new Vehicle("Lamborghini_Hurrican",800));
        list.add( new Vehicle("BMW_M5",750));

        Collections.sort(list);
        System.out.println(list);

        // Comparator with Lambda Expression

        ArrayList<Vehicle> li = new ArrayList<>();
        
        li.add(new Vehicle("Toyota Supra MK4", 720));
        li.add(new Vehicle("Bugatti Divo", 850));
        li.add(new Vehicle("Rang Rover Sports", 700));
        li.add(new Vehicle("Land Rover Defender", 710));

        Comparator<Vehicle> comp = (Vehicle v1, Vehicle v2) -> v1.power>v2.power?1:-1;

        Collections.sort(li ,comp);
        System.out.println(li);

    }
}
