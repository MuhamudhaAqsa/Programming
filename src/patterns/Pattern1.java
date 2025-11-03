package patterns;

import java.util.Scanner;

public class Pattern1
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     int n = input.nextInt();
     printPattern1(n);
    }
    static void printPattern1(int n)
    {
        for(int r = 1 ; r <= n ; r++)
        {
            for(int c = 1 ; c <= n ; c++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
