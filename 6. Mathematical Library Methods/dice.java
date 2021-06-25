/*
 * WAP to show the number we got after a throw of a dice
 */

class dice
{
    public static void main()
    {
            int n = (int) (Math.random()*6)+1;
            System.out.println("We got "+n);
    }
}