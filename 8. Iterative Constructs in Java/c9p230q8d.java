package class9.chapter8;
/**
 * WAP to find sum of series
 * @author (Ashutosh Sharma)
 */
class c9p230q8d
{
    public static void main(String[] args)
    {
        double sum=0;
        for (int i = 1; i <= 19; i++) 
        {
            sum += (double) i/(i+1);    
        }
        System.out.println("Sum of series = "+sum);
    }   
}