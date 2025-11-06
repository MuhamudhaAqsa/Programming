package patterns;

import java.util.Scanner;

public class Pattern36
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printPattern36(n);
    }
    static void printPattern36(int n)
    {
        int num = 1;
        for(int r = 1 ; r <= n ; r++)
        {
            for(int c = 1 ; c <= n - r + 1 ; c++)
            {
                if(c == 1)
                {
                    System.out.print(num);
                }
                else
                {
                    System.out.print(" " + num);
                }
                num = num + 1;
            }
            System.out.println();
        }
    }
}
