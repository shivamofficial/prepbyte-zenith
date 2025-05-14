package zenith;

public class LastOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int[] arr = {0, 1, 0, 1, 0, 0, 1};
	        int lastIndex = -1;
	        
	        for(int i=0;i<arr.length;i++)
	        {
	        	if(arr[i]==1)
	        	{
	        		lastIndex=i;
	        	}
	        }
	        System.out.println("Last index of 1 is: " + lastIndex);
	}

}
