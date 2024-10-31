package Java_Adv.ThirteenStream;

import java.util.ArrayList;
import java.util.Random;

public class FourParallelSt {
    public static void main(String[] args){
        
        ArrayList<Integer> list = new ArrayList<>();
        
        Random ran = new Random();

        for(int i = 1; i<=200; i++)
        {
            list.add( ran.nextInt(100) );
        }

        // int sum1 = list.stream()
        //                 .map(n -> n*2)
        //                 .reduce(0, (c,e) -> c+e);

        // System.out.println(sum1);

        
        long startSeq1 = System.currentTimeMillis();
        
        int sum2 = list.stream()
                        .map(n ->
                        {
                            try{
                                Thread.sleep(1);
                            }
                            catch(Exception e){
                                
                            }
                            return 2*n;
                        })
                    .mapToInt(i -> i)
                    .sum();
                    
        long endSeq1 = System.currentTimeMillis();
        System.out.println("Seq : "+ (endSeq1-startSeq1) );
 
        
        long startSeq2 = System.currentTimeMillis();

        int sum3 = list.parallelStream()
                    .map(n ->
                    {
                        try
                        {
                            Thread.sleep(1);
                        }
                        catch(Exception e){

                        }
                        return 2*n;
                    })
                    .mapToInt(i -> i)
                    .sum();

        long endSeq2 = System.currentTimeMillis();
        System.out.println("Para : "+ (endSeq2-startSeq2) );
        
        System.out.println(sum2);
        System.out.println(sum3);

        
    }
}
