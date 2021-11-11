package class9.chapter8;
/**
 * WAP to find sum of series
 * @author (Ashutosh Sharma)
 */
class c9p230q8a
{
    public static void main(String[] args)
    {
        int sum=0;
        for (int i = 1; i <= 20; i++) 
        {
            sum += i*i;
        }
        System.out.println("Sum of series = "+sum);
    }   
}