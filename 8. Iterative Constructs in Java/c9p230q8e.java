package class9.chapter8;
/**
 * WAP to find sum of series
 * @author (Ashutosh Sharma)
 */
class c9p230q8e
{
    public static void main(String[] args)
    {
        int sum=0;
        for (int i = 1; i <= 10; i++) //4
        {
              if(i%2!=0) 
                sum=sum + 2*i;  //sum = 2 -4 + 6
              else
                sum=sum - 2*i;  // 2 - 4 + 6 - 8
        }
        System.out.println("Sum of series = "+sum);
    }   
}