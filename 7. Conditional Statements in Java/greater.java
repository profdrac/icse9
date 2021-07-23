package class9.chapter7;
//WAP to show greater of two numbers or if they are equal
import java.util.Scanner;

class greater
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b)
        {
            System.out.print("a is greater");
        }
        else if(b>a)
        {
            System.out.print("b is greater");
        }
        else
        {
            System.out.print("Numbers are equal");
        }
        sc.close();
    }
}