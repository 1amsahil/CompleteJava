package Java_Adv.ThirteenStream;
import java.util.List;
import java.util.Arrays;

public class SixMethodReference {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Sahil","Eternity","Jack");
        List<String> upList = list.stream()
                                // .map( str -> str.toUpperCase())
                                .map(String::toUpperCase) // :: -> Method Reference
                                .toList();

        System.out.println(list);
        System.out.println(upList);
    }
}
