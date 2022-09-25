//sum of 1 to 50 natural numbers

class Natural
{
	public static void main(String a[])
	{
		int i,num=50,sum=0;
		
		for(i=1;i<=num;i++)
		{
			sum = sum + i;
		}
		
		System.out.println("\n Sum of 1-50 Natural numbers is : " + sum);
	}
}

