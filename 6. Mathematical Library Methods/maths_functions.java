package class9.chapter6;
/**
 * WAP to show use of max, min, pow, sqrt, cbrt and log functions of Math class
 * @author (Ashutosh Sharma)
 */

class maths_functions
{
    public static void main(String[] args)
    {
        System.out.println("Smaller number is "+Math.min(10,20));
        System.out.println("Bigger number is "+Math.max(10,20));
        System.out.println("10th power  of 2 is "+Math.pow(2,10));
        System.out.println("Square-root of 144 is "+Math.sqrt(144));
        System.out.println("Cube-root of 250 is "+Math.cbrt(250));
        System.out.println("Log of 6.25 is "+Math.log(6.25));
    }   
}