/*
WAP to show smallest of three numbers input by user by using functions of Math class.
*/

import java.util.Scanner;

class revision01072021_4a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("Smallest number is ");
        System.out.println(Math.min(Math.min(a, b), c));
        sc.close();       
    }
}