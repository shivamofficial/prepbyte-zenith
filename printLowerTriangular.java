package zenith;

public class printLowerTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		
		int row=matrix.length;
		int col=matrix[0].length;
		
	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			
				if(j>i)
				{
					matrix[i][j]=0;
					System.out.print(matrix[i][j]+" ");
				}
				else
				{
					System.out.print(matrix[i][j]+" ");
				}
			}
			System.out.println();
		}
		

	}

}
