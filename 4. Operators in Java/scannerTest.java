package class9.chapter4;

import java.util.Scanner;

class scannerTest
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = sc.next();
        System.out.print("Enter roll number: ");
        int rn = sc.nextInt();
        System.out.print("Enter class: ");
        String cls = sc.next();
        System.out.println("Name = "+n);
        System.out.println("Roll Number = "+rn);
        System.out.println("Class = "+cls);
        sc.close();
    }
}