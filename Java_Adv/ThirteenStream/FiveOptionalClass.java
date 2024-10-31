package Java_Adv.ThirteenStream;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;


public class FiveOptionalClass {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Sahil","Eternity","Jack");

        Optional<String> name = str.stream()
                        .filter(s -> s.contains("c") )
                        .findFirst();

        System.out.println( name.orElse("Not Found") );
        // System.out.println( name.get() );
    }
}
