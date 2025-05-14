package zenith;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		//int n=sc.nextInt();
		
		int k=2;
		int arr[] = {1, 2, 3, 4, 5, 6};
		
	
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
		//right rotatation
		int n=arr.length;
		
		  k = k % n;// // Reduces k to a value between 0 and n-1//handle case when k >n then
		  int[] rotated = new int[n];
		for(int i=0;i<n;i++)
		{
			rotated[(i+k)%n]=arr[i];
		}
		
		  // Print rotated array
        for (int val : rotated) {
            System.out.print(val + " ");
        }
	}
	

}
