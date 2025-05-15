package zenith;

public class OperationsonMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] m1= {{1,2},{3,4}};
		int [][] m2= {{5,6},{7,8}};
		
		int row=m1.length;
		int col=m1[0].length;
		
			int [][] sum= new int [row][col];
			int [][] mul= new int [row][col];
			
			
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum[i][j]=m1[i][j]+m2[i][j];
				//mul[i][j]+=m1[i][k]*m2[k][j];
			
				//mul[i][]
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
		//  multiply 
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				for(int k=0;k<row;k++)
				{
					mul[i][j]+=m1[i][k]*m2[k][j];
					
				}
				System.out.print(mul[i][j]+" ");
			
			
				
			}
			System.out.println();
		}
				
		
	}

}
