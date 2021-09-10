package class9.chapter7;
/**
 * WAP to show sum and interest earned using switch ([s]imple and [c]ompound)
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p182q19
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type of interest:");
        System.out.println("[S] Simple");
        System.out.println("[C] Compound");
        System.out.println("Your choice?");
        String toi=sc.next();
        switch(toi)
        {
            case "S":
                System.out.print("Enter values of p,r and t:");
                double p=sc.nextDouble();
                double r=sc.nextDouble();
                int t=sc.nextInt();
                double si=(p*r*t)/100;
                System.out.println("Sum = Rs."+p);
                System.out.println("Interest = Rs."+si);
                System.out.println("Amount = Rs."+(p+si));
                break;
            case "C":
                System.out.print("Enter values of p,r and t:");
                p=sc.nextDouble();
                r=sc.nextDouble();
                t=sc.nextInt();
                double ci=p*((Math.pow(1+(r/100),t)-1));
                System.out.println("Sum = Rs."+p);
                System.out.println("Interest = Rs."+ci);
                System.out.println("Amount = Rs."+(p+ci));
                break;
            default:
                System.out.print("Invalid choice!");
        }
    }   
}