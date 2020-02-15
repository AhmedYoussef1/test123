package calculator;

import java.util.Scanner;

public class Calculator {
    static Scanner input = new Scanner(System.in);
    static int x,y;
    public static void main(String[] args) { 
        System.out.print("Enter the first number ");
        x = input.nextInt();
        System.out.print("Enter the second number ");
        y = input.nextInt();
        System.out.println(x+" + "+y+" = "+sum(x,y));
        System.out.println(x+" / "+y+" = "+divide(x,y));
        
    }
    static int sum(int n1,int n2)
    {
        return n1+n2;
    }
    static double divide(int n1, int n2)
    {
        return (double)n1/n2;
    }
    
    
}
