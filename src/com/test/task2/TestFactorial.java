package com.test.task2;

import java.util.Scanner;

public class TestFactorial
{
    public static void main(String args[])
    {
        //int n=20;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number (<20): ");
        int n = in.nextInt();
        in.close();

        if(n <= 20)
        {
            String output = String.format("%.8f", un(n));
            System.out.println("Result for " + n + " = " + un(n) + " output=" + output);
        }
        else
            System.out.println("Range error. Number is too big.");
    }

    private static long getFactorial(int f)
    {
        long result = 1;
        for (int i = 1; i <= f; i++)
            result = result * i;
        return result;
    }

    private static long sumFactorials(int f)
    {
        long result = 1;
        for (int i = 2; i <= f; i++)
            result = result + getFactorial(i);
        return result;
    }

    private static double un(int f)
    {
        //long part0 = getFactorial(f);
        //double part1 = 1.0/getFactorial(f);
        //long part2 = sumFactorials(f);
        //System.out.println("part0 = " + part0 + " part1 = " + part1 + "  part2=" + part2);
        return (1.0/getFactorial(f)) * sumFactorials(f);
    }
}
