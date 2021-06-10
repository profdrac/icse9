package class9.chapter4;


class p94q6
{
    public static void main()
    {
        int r1 = 3, r2 = 4, r3 = 5, r4 = 6;
        //x = angle assumed
        double x = 360 / (double)(r1 + r2 + r3 + r4);
        double a = r1 * x;
        double b = r2 * x;
        double c = r3 * x;
        double d = r4 * x;
        System.out.println("Angle A = " + a);
        System.out.println("Angle B = " + b);
        System.out.println("Angle C = " + c);
        System.out.println("Angle D = " + d);
    }
}