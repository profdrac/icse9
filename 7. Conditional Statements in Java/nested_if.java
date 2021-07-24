package class9.chapter7;

//WAP to get a number. Check if it is a postive no. If so, check whether its even or odd.
import java.util.Scanner;

class nested_if
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n>0)
        {
            if(n%2==0)
            {
                System.out.println("Even number");
            }
            else
            {
                System.out.println("Odd number");
            }
        }
        else
        {
            System.out.println("Number is not positive");
        }
        sc.close();
    }
}