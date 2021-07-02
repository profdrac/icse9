/*
WAP to display the side of a cube by taking its volume as an input.
Side of a cube = cube-root of volume
*/

import java.util.Scanner;

class revision02072021_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter volume of the cube:");
        int vol = sc.nextInt();
        double side = Math.cbrt(vol);
        System.out.print("Side of the cube is "+side);
        sc.close();
    }    
}