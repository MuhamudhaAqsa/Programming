package patterns;

import java.util.Scanner;

public class Pattern5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printPattern5(n);
    }
    static void printPattern5(int n)
    {
        for(int r = 1 ; r < n * 2  ; r++)
        {
            if(r <= n)
            {
                for(int c = 1 ; c <= r ; c++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                for(int c = 1 ; c <= n * 2 - r ; c++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
