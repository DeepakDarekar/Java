package assignments;

import java.util.Scanner;

//Assignment 5: Write a Program to print the pattern Stars in Triangle Shape
public class PatternStarsTriangle
{
    public static void main(String args[])
    {
        int i, space, rows, k=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        rows = sc.nextInt();
        sc.close();
        for(i=1; i<=rows; i++)
        {
            for(space=1; space<=(rows-i); space++)
            {
                System.out.print("  ");
            }
            while(k != (2*i-1))
            {
                System.out.print("* ");
                k++;
            }
            k = 0;
            System.out.println();
        }
    }
}