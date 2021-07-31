import java.util.Scanner;

class numberChecker
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("Not a number between 1 and 4");
        }
        sc.close();
    }
}