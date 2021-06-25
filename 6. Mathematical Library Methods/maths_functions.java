/**
 * WAP to show various Math functions
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
        //--25/06/2021
        System.out.println("Absolute of -27 is "+Math.abs(-27));
        System.out.println("Absolute of -98.5 is "+Math.abs(-98.5));
        System.out.println("Absolute of 15 is "+Math.abs(15));
        System.out.println("Round of 8.5 is "+Math.round(8.5));
        System.out.println("Rint of 8.5 is "+Math.rint(8.5));
        System.out.println("Ceil of 8.1 is "+Math.ceil(8.1));
        System.out.println("Floor of 8.1 is "+Math.floor(8.1));
        System.out.println("Random returns "+Math.random());
    }  
}