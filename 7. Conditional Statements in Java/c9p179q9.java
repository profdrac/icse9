package class9.chapter7;
/**
 * WAP to find amount to be paid for taxi
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p179q9
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter taxi no:");
        String tno=sc.nextLine();
        System.out.print("Enter distance travelled:");
        int d=sc.nextInt();
        int amt=0;
        if(d<=5)
        {
            amt=100;
        }
        else if(d>5 && d<=15)   
        {
            amt=100+(d-5)*10;
        }
        else if(d>15 && d<=25)
        {
            amt=100+100+(d-15)*8;
        }
        else
        {
            amt=100+100+80+(d-25)*5;
        }
        System.out.println("Taxi number:"+tno);
        System.out.println("Distance:"+d);
        System.out.println("Amount to be paid is Rs."+amt);
    }   
}