package assignments;

import java.util.Scanner;

//Assignment 6:Write a program to find the first 10 Prime Numbers
public class PrimeNumberProgramFirstTen 
{
    static boolean checkForPrime(int inputNumber)
    {
        boolean isItPrime = true;
        
        if(inputNumber <= 1) 
        {
            isItPrime = false;
            
            return isItPrime;
        }
        else 
        {
            for (int no = 2; no <= inputNumber/2; no++) 
            {
                if ((inputNumber % no) == 0)
                {
                    isItPrime = false;
                    
                    break;
                }
            }
            
            return isItPrime;
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many Prime Numbers do you want?");
        
        int n = sc.nextInt();
        
        int counter = 1;
        
        int inputNumber = 2;
        
        System.out.println("First "+n+" Prime Numbers :");
        
        while (counter <= n)
        {    
            if (checkForPrime(inputNumber))
            {
                System.out.println(inputNumber);
                
                counter++;
                
                inputNumber++;
            }
            else
            {
                inputNumber++;
            }
        }
        
        sc.close();
    }
}