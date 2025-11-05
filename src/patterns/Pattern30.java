package patterns;

import java.util.Scanner;

public class Pattern30
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     int n = input.nextInt();
     for(int r = 1 ; r <= n ; r++)
     {
         int num = r;
         for(int c = 1 ; c < n + r ; c++)
         {
             if(c <= n - r)
             {
                 System.out.print(" ");
             }
             else if(c < n)
             {
                 System.out.print(num + " ");
                 num = num - 1;
             }
             else if(c == n)
             {
                 System.out.print(num + " ");
             }
             else
             {
                 num = num + 1;
                 System.out.print(num + " ");
             }
         }
         System.out.println();
     }
    }
}
