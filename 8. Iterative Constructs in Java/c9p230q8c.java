package class9.chapter8;
/**
 * WAP to find sum of series
 * @author (Ashutosh Sharma)
 */
class c9p230q8c
{
    public static void main(String[] args)
    {
        double sum=0;
        for (int i = 1; i <= 19; i=i+2) 
        {
            sum = sum + (double) 1/i;
        }
        System.out.println("Sum of series = "+sum);
    }   
}