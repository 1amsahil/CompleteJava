
package Java_Adv.FourEnum;

enum Laptop
{
    Macbook(1500), Victus, Strix(1000), Rog(1200);

    private int price;


    private Laptop()
    {
        price = 700;
    }

    private Laptop(int p)
    {
        this.price = p;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int value)
    {
        this.price = value;
    }


}

public class EnumClass {
    public static void main(String[] args) {
        
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap+" : "+ lap.getPrice());
        
        Laptop lap[] = Laptop.values();
        
        
        for(Laptop L : lap)
        {
            System.out.println(L+" : "+ L.getPrice());
        }
    }
}
