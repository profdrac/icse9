import java.util.Scanner;
class digits
{
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no:");
		int n = sc.nextInt(); //748
		while(n>0)
		{
			int rem = n%10;
			System.out.println(rem);
			n = n/10;
		} 
	}
}

































