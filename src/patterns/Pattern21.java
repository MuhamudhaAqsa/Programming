package patterns;


import java.util.Scanner;

public class Pattern21
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printPattern21(n);
    }
    static void printPattern21(int n)
    {
        int num = 1;
        for(int r = 1 ; r <= n ; r++)
        {
            for(int c = 1 ; c <= r ; c++)
            {
                if(c == 1)
                {
                    System.out.print(num);
                    num = num + 1;
                }
                else
                {
                    System.out.print(" " + num);
                    num = num + 1;
                }
            }
            System.out.println();
        }
    }
}
