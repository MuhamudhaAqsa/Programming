package patterns;

import java.util.Scanner;

public class Pattern3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printPattern3(n);
    }
    static void printPattern3(int n)
    {
        for(int r = n ; r >= 1 ; r--)
        {
            for(int c = 1 ; c <= r ; c++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
