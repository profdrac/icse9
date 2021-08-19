package class9.chapter7;

//WAP to show whether its weekday or weekend, depending on the day entered by the user
import java.util.Scanner;

class weekday
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number: ");
        int day = sc.nextInt();
        switch(day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Its a weekday");
                break;
            case 6:
            case 7:
                System.out.println("Its a weekend");
                break;
            default:
                System.out.println("Not a valid day!");
        }
        sc.close();
    }
}