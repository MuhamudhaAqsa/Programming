package patterns;

import java.util.Scanner;

public class Pattern2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printingPattern2(n);
    }
    static void printingPattern2(int n)
    {
       for(int row = 1 ; row <= n ; row++)
       {
           for(int col = 1 ; col <= row ; col++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}


