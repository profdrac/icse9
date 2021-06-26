package class9.chapter6;

/*
 * WAP to show whether we got heads(0) or tails(1) upon throw of a coin
 */

class coin
{
    public static void main()
    {
            int n = (int) (Math.random()*2);
            if(n==0)
            {
                System.out.println("We got heads");
            }
            else
            {
                System.out.println("We got tails");
            }
    }
}