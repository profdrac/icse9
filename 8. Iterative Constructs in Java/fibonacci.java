/**
 * WAP to generate fibonacci series upto 10 terms
 * 0, 1, 1, 2, 3, 5, 8------------
 * @author Ashutosh Sharma
 */
class fibonacci
{
    public static void main()
    {
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for(int i=0;i<8;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}