package class9.chapter7;
/**
 * WAP to calculate and display equivalent resistances
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p181q18
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose type of connection:\n[1] Series\n[2]Parallel");
        System.out.print("Your choice:");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.print("Enter values of r1 and r2:");
                int r1=sc.nextInt();
                int r2=sc.nextInt();
                int R=r1+r2;
                System.out.print("Resistance = "+R);
                break;
            case 2:
                System.out.print("Enter values of r1 and r2:");
                r1=sc.nextInt();
                r2=sc.nextInt();
                R=(r1*r2)/(r1+r2);
                System.out.print("Resistance = "+R);
                break;
            default:
                System.out.print("Invalid choice!!!");
        }
    }   
}