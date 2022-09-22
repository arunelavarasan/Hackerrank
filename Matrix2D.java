package Hackerranker;
//There are  hourglasses in . An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum. 
//The array will always be . example

//a b c
//  d
//e f g
import java.util.Scanner;

public class Matrix2D {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 6x6 matrix element");
        int [][] a = new int [6][6];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
		  int max = Integer.MIN_VALUE;
		  for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					if(i>0&&j>0&&j<a.length-1&&i<a.length-1)
					{
						int sum = 0;
						sum = sum + a[i][j] + a[i-1][j] + a[i+1][j]
								+ a[i-1][j-1] + a[i+1][j-1] +
								a[i+1][j+1] + a[i-1][j+1];
						if(sum>max)
						{
							max = sum;
						}
					}
				}
			}
		  System.out.print(max);
	}
}
//TestCase 1:
//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 2 4 4 0
//0 0 0 2 0 0
//0 0 1 2 4 0
//maximum sum of hourglass is 19

//TestCase 2:
//-9 -9 -9  1 1 1 
//0 -9  0  4 3 2
//-9 -9 -9  1 2 3
//0  0  8  6 6 0
//0  0  0 -2 0 0
//0  0  1  2 4 0
//maximum sum of hourglass is 28


