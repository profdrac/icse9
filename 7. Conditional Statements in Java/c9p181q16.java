package class9.chapter7;
/**
 * WAP to show volume of different solids
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p181q16
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Volume of Cuboid");
        System.out.println("2.Volume of Cylinder");
        System.out.println("3.Volume of Cone");
        System.out.print("Enter your choice:");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.print("Enter length, breadth and height of cuboid:");
                int l=sc.nextInt();
                int b=sc.nextInt();
                int h=sc.nextInt();
                double v=l*b*h;
                System.out.println("Volume of Cuboid="+v);
                break;
            case 2:
                System.out.print("Enter radius and height of cylinder:");
                int r=sc.nextInt();
                h=sc.nextInt();
                v=3.14*r*r*h;
                System.out.println("Volume of Cylinder="+v);
                break;
            case 3:
                System.out.print("Enter radius and height of Cone:");
                r=sc.nextInt();
                h=sc.nextInt();
                v=(1.0/3.0)*3.14*r*r*h;
                System.out.println("Volume of Cone="+v);
                break;
            default:
                System.out.print("Invalid choice!");
        }
        sc.close();
    }   
}