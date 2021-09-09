package class9.chapter7;
/**
 * WAP to print bill after shopping
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p181q17
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("[1] Ground Floor - Kids Wear");
        System.out.println("[2] First Floor - Ladies Wear");
        System.out.println("[3] Second Floor - Designer Sarees");
        System.out.println("[4] Third Floor - Mens Wear");
        System.out.println("To which floor do you want to go? ");
        int ch=sc.nextInt();
        if(ch<1 || ch>4)
        {
            System.out.print("Are you blind?");
            System.exit(0);
        }
        System.out.print("Enter purchase-amount: Rs.");
        double amt=sc.nextDouble();
        System.out.println("\fName of the Shop: City Mart");
        switch(ch)
        {
            case 1:
                System.out.println("Type: Kids Wear");
                break;
            case 2:
                System.out.println("Type: Ladies Wear");
                break;
            case 3:
                System.out.println("Type: Designer Sarees");
                break;
            case 4:
                System.out.println("Type: Mens Wear");
                break;
            default:
                System.out.println("Invalid floor number");
        }
        System.out.println("Total Amount: Rs."+amt);
        System.out.println("Visit Again!!!");
    }   
}