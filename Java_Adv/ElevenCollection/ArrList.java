package Java_Adv.ElevenCollection;
import java.util.ArrayList;


public class ArrList {
    public static void main(String[] args)
    {

        ArrayList<Integer> list = new ArrayList<>();
        // add  
        list.add(45);
        list.add(89);
        list.add(23);
        list.add(23);
        list.add(50);
        list.add(18);
        System.out.println("List : "+list);

        // size
        System.out.println("Size : "+list.size());

        // remove(index)
        list.remove(2);
        System.out.println("Remove index 2 : "+list);
        
        // remove(obj)
        list.remove((Integer)23);
        System.out.println("Remove Object 23 : "+list);

        // set
        list.set(3,34);
        System.out.println("Set index 3 : "+list);

        // conatains
        System.out.println("Conatains Element 18 : "+list.contains(18));
        
        // isEmpty
        System.out.println("Empty : "+list.isEmpty()); 
    }
}
