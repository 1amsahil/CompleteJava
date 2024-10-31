package Java_Adv.ThirteenStream;

import java.util.ArrayList;
// import java.util.stream.Stream;

public class TwoStreamAPI {
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(1);
        num.add(6);
        num.add(5);
        num.add(7);

        // Stream<Integer> s1 = num.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0,(c,e)->c+e);

        int result =  num.stream()
                         .filter(n -> n%2==0)
                         .map(n -> n*2)
                         .reduce(0, (c,e) -> c+e);

        System.out.println(result);
    }
}
