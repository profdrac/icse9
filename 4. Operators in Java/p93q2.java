//WAP to show salary of a person after a month at work
package class9.chapter4;

class p93q2
{
    public static void main()
    {
        /*
         * wd = weekdays for which the person went to job
         * ad = days of absence
         */
        int wd=25, ad=5;
        int income = wd*350 - ad*30;
        System.out.println("Income per month = Rs."+income);
    }
}