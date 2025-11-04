package patterns;

import java.util.Scanner;

public class Pattern28
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printPattern28(n);
    }
    static void printPattern28(int n)
    {
        for(int r = 1 ; r < 2 * n ; r++)
        {
            if(r <= n)
            {
                for(int c = 1 ; c <= n ; c++)
                {
                    if(c <= n - r)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("* ");
                    }
                }
            }
            else
            {
                for(int c = 1 ; c <= n ; c++)
                {
                    if(c <= r - n)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("* ");
                    }
                }
            }

            System.out.println();
        }
    }
}
