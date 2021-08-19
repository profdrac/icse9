package class9.chapter7;

/* WAP to get month number and show season of the year if:
 * Winter - 12, 1, 2
 * Spring - 3, 4, 5
 * Summer - 6, 7, 8
 * Autumn - 9, 10, 11
 */
import java.util.Scanner;

class seasons
{
    public static void main()
    {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month = sc.nextInt();
        switch(month)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Not a valid month!");
        }
        sc.close();
    }
}