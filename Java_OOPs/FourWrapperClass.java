package Java_OOPs;

public class FourWrapperClass {
    public static void main(String[] args) {
        
        int num = 10;
        
        // Integer n = new Integer(10); // Boxing
        Integer n = num; // Auto-Boxing

        // int x = n.intValue(); // UnBoxing
        int x = n; // Auto-Unboxing

        System.out.println(x);


        // Convert String to Integer

        String str = "12";
        int val = Integer.parseInt(str);  // Integer.parseInt(String) :- convert the String into Integer.
        System.out.println(2*val);
        
        
    }
}
