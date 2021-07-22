package class9.chapter7;

import java.util.Scanner;
class multipleif
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be checked: ");
        int n = sc.nextInt();
        if(n==0)
        {
            System.out.println("Number is zero");
        }
        if(n%2 == 0)
        {
            System.out.println("Number is even");
        }
        if(n%2 != 0)
        {
            System.out.println("Number is odd");
        }
        sc.close();
    }
}