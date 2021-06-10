package class9.chapter4;


import java.util.Scanner;

class getname
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = sc.nextLine();
        System.out.println("Name = "+n);
        sc.close();
    }
}