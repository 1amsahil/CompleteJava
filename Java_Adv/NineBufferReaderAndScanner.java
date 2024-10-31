package Java_Adv;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NineBufferReaderAndScanner {
    public static void main(String[] args) throws Exception {

        // User Input from BufferedReader Class

        System.out.println("Enter the Number : ");
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        
        int num = Integer.parseInt(bf.readLine());
        
        System.out.println(num);

        // User Input from Scanner Class 
        
        System.out.println("Enter the Number : ");
        
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        System.out.println(val);

        bf.close();
        sc.close();
    }
}
