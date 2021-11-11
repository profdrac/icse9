package class9.chapter8;
/**
 * WAP to find sum of series
 * @author (Ashutosh Sharma)
 */
class c9p230q8f
{
    public static void main(String[] args)
    {
        int sum=0;
        for (int i = 1; i <= 19; i++) 
        {
            sum = sum+ i*(i+1);
        }
        System.out.println("Sum of series = "+sum);
    }   
}