import java.util.Scanner;
/**
 * WAP to check whether given no is Smith or not (Joke)
 * e.g. 85
 * @author Ashutosh Sharma
 */
class smith
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int n=sc.nextInt();
        int t=n;
        int sumd=0;
        int sumdpf=0;
        //get sum of digits of number
        while(n>0)
        {
            sumd+=n%10;
            n/=10;
        }
        n=t;
        //get all factors of the number
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                int c=0;
                //check if factor is prime
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    c++;
                }
                //if factor is prime
                if(c==0)
                {
                    int m=i;
                    //get sum of digits of factor
                    while(m>0)
                    {
                        sumdpf+=m%10;
                        m/=10;
                    }
                }
            }
        }
        //if sum of digits of number equals sum of digits of prime-factors
        if(sumd==sumdpf)
            System.out.print("Smith number/Joke number");
        else
            System.out.print("Not a Smith number/Joke number");
        sc.close();
    }
}
