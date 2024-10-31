package Java_Adv.ThirteenStream;

import java.util.ArrayList;
import java.util.stream.Stream;
// import java.util.function.Predicate;
// import java.util.function.Function;

public class ThreeMapFilterReduceSort {
    public static void main(String[] args) {
         ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(1);
        nums.add(6);
        nums.add(5);
        nums.add(7);

        int result =  nums.stream()
                         .filter(n -> n%2==0)
                         .map(n -> n*2)
                         .reduce(0, (c,e) -> c+e);
        
        System.out.println("Result after Filter, Map, Reduce : "+result);

        // How Filter works :- 

            // Predicate<Integer> p = new Predicate<Integer>() {
            //     public boolean test(Integer n)
            //     {
            //         return n%2 ==0;
            //     }
            // };

            // Stream<Integer> st = nums.stream();
            // Stream<Integer> filt = st.filter(p);


        // How Map Works :-
        
            // Function<Integer, Integer> fun = new Function<Integer,Integer>() {
            //     public Integer apply(Integer n)
            //     {
            //         return n*2;
            //     }
            // };

            // Stream<Integer> st = nums.stream();
            // Stream<Integer> map = st.map(fun);

        // sorted
        Stream <Integer> sortedSt = nums.stream()
                                        .sorted();
            
        sortedSt.forEach(n -> System.out.println(n));
    }
}
