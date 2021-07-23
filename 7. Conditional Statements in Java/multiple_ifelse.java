package class9.chapter7;
//WAP to check whether given no is +ve, -ve or zero
import java.util.Scanner;

class multiple_ifelse
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be checked: ");
        int n = sc.nextInt();
        if(n>0)
        {
            System.out.print("+ve");
        }
        else if(n<0)
        {
            System.out.print("-ve");
        }
        else
        {
            System.out.print("Zero");
        }
        sc.close();
    }
}