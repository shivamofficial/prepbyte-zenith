package zenith;

import java.util.*;
public class MinimumHouseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr= {7,2,8,4,3,9,1};
		
		int mini=Integer.MAX_VALUE;
		int index=-1;
		
		for(int i=0;i<arr.length;i++)
		{
	if(arr[i]<mini)
	{
		mini=arr[i];
		
	}
	index=i;
		}
			
		System.out.println("Your message here"+index);
	}


}
