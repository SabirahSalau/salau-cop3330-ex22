/*
 *  UCF COP3330 Summer 2021 Assignment 22 Solution
 *  Copyright 2021 Sabirah Salau
 */


package org.example;

import java.util.Scanner;

public class Problem22
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int first = input.nextInt();

        System.out.println("Enter the second number:");
        int second = input.nextInt();

        if(first == second)
        {
            System.out.println("Do not match numbers!");
            System.exit(0);
        }

        System.out.println("Enter the third number:");
        int third = input.nextInt();

        if(third == first || third == second)
        {
            System.out.println("Do not match numbers!");
            System.exit(0);
        }

        int max = 0;

        if(max < first)
        {
            max = first;
            if(max < second)
            {
                max = second;
                if(max < third)
                {
                    max = third;
                }
            }
        }

        System.out.println("The largest number is "+ max);
    }
}
