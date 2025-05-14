

public class DivisorSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int n = 36; // Change this number as needed
	        int sum = 0;
	        
	        for(int i=1;i*i <=n;i++)
	        {
	        	if(n %i==0)
	        	{
	        		  System.out.print(i + " "); // Print i
	        	
	        	
	        	if(i !=n/i)
	        	{
	        		System.out.print(n/i + " "); // Print i
	        	}
	        	}
	        }

	}

}
