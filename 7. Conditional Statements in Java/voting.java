package class9.chapter7;

import java.util.Scanner;

class voting
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if(age>=18 && age<=100)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You cannot vote yet");
        }
        sc.close();
    }
}