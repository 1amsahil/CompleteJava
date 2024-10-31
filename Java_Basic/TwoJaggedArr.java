package Java_Basic;

public class TwoJaggedArr{
    public static void main(String[] args)
    {
        // Jagged Array :- Only Defining the rows or Most Outer array, In the next line we define the coulmns or inner array  
        int nums[][] = new int [3][];

        nums[0] = new int[5]; // Index 0 means 1st rows consists 5 columns
        nums[1] = new int[7]; // Index 1 means 2nd rows consists 7 columns
        nums[2] = new int[3];

        for(int i = 0; i<nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++ )
            {
                nums[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i[]:nums)
        {
            for(int j : i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}