package class9.chapter8;

//WAP to show sum of all numbers between 1-100

class sumAll1_100
{
    public static void main()
    {
        int sum = 0;
        for(int i=1; i<=100; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum of numbers between 1-100 is "+sum);
    }
}