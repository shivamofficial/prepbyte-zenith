package zenith;

import java.util.ArrayList;
import java.util.List;

public class GreaterThanNeighbors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int [] rent= {4,3,5,2,1};
		int [] rent= {7,2,8,4,3,9,1};
		int n=rent.length;
		List<Integer> result= new ArrayList<>();
		
		
		if(rent[0]>rent[1])
		{
			result.add(0);
		}
		if(rent[n-1]>rent[n-2])
		{
			result.add(n-1);
		}
		for(int i=1;i<n;i++)
		{
			if(rent[i]>rent[i-1] && rent[i]>rent[i+1] && i <n)
			{
				result.add(i);
			}
		}
		
		//Output result
        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int idx : result) {
                System.out.print(idx + " ");
            }
            System.out.println();
        }
	}

}
