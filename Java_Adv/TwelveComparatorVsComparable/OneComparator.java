package Java_Adv.TwelveComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OneComparator {
        public static void main(String[] args)
    {
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j)
            {
                if(i%10> j%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };

        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(89);
        list.add(23);
        list.add(50);
        list.add(18);

        Collections.sort(list,comp);
        System.out.println(list);
    }
}
