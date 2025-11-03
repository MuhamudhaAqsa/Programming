package patterns;

import java.util.Scanner;

public class Pattern4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printPattern4(n);
    }
    static void printPattern4(int n)
    {
        for(int r = 1 ; r <= n ; r++)
        {
            for(int c = 1 ; c <= r ; c++)
            {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
