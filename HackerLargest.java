package Hackerranker;

public class HackerLargest {
	public static void main(String[] args)
	{
		int [][] a = {{-1,-1,-1},{-2,-2,-2},{-3,-3,-3}};
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			int sum = 0;
			for(int j=0;j<a.length;j++)
			{
				sum = sum + a[i][j];
			}
			if(sum>max)
			{
				max = sum;
			}
		}
		System.out.print(max);
	}
}
