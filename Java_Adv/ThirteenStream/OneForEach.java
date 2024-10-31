package Java_Adv.ThirteenStream;
import java.util.ArrayList;
import java.util.function.Consumer;

public class OneForEach {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(10);
        list.add(7);
        list.add(8);

        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n)
            {
                System.out.println(n);
            }
        };

        list.forEach(con);

        // Lambda forEach
        // list.forEach(n-> System.out.println(n));
        
    }
}
