package zenith;

public class ScalarMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int[][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6}
		        };

		        int K = 2; // Scalar value
		        
		        int row=matrix.length;
		        int col=matrix[0].length;
		        

		        System.out.println("Resultant matrix after scalar multiplication:");
		        
		        for(int i=0;i<row;i++)
		        {
		        	for(int j=0;j<col;j++)
		        	{
		        		System.out.print(matrix[i][j] * K + " ");
		        	}
		        	  System.out.println(); // move to the next line
		        }

	}

}
