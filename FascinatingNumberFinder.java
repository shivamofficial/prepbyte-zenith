import java.util.HashSet;

public class FascinatingNumberFinder {
	public static boolean validcheck(int n)
	{
		HashSet<Integer> set= new HashSet<>();
		
		while(n >0)
		{
			int rem=n%10;
			set.add(rem);
			n=n/10;
		}
		return set.size()==4;
	}

	public static int nextFascinatingNumber(int n)
	{
		
		for(int i=n+1;i<=9999;i++)
		{
			if(validcheck(i))
			{
				return i; // Return the first number with unique digits
			}
		
		}
		return -1; // This shouldn't happen given constraints
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//int n=1234;
		int n=2010;
	
	 System.out.println(nextFascinatingNumber(n));

	}

}
