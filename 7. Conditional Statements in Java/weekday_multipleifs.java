import java.util.Scanner;

class weekday_multipleifs
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day no: ");
        int day = sc.nextInt();
        if(day==1)
        {
            System.out.println("Monday");
        }
        if(day==2)
        {
            System.out.println("Tuesday");
        }
        if(day==3)
        {
            System.out.println("Wednesday");
        }
        if(day==4)
        {
            System.out.println("Thursday");
        }
        if(day==5)
        {
            System.out.println("Friday");
        }
        if(day==6)
        {
            System.out.println("Saturday");
        }
        if(day==7)
        {
            System.out.println("Sunday");
        }
        if(day<1 || day>7)
        {
            System.out.println("Invalid day number!");
        }
        sc.close();
    }
}