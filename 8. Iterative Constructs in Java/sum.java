class sum
{
    public static void main()
    {
        int sume = 0, sumo = 0;
        for(int i=0; i<=1000; i++)
        {
		if(i%2 == 0)
            		sume = sume + i;
		else
			sumo = sumo + i;
        }
        System.out.println("Sum of evens "+sume);
	System.out.println("Sum of odds "+sumo);
    }
}
