package AntiDiagonals;

import java.util.Scanner;

public class AntiDiagonals {
	
	public static void antiDiagonal(int[][] mat,int rows,int cols)
	{
		for(int x=0;x<cols;x++)
		{
			int i=0;
			int j=x;
			while(i<rows && j>=0)
			{
				System.out.print(mat[i][j]+" ");
				i++;
				j--;
			}
			System.out.println();
		}
		
		for(int y=1;y<rows;y++)
		{
			int i=y;
			int j=cols - 1;
			while(i<rows && j>=0)
			{
				System.out.print(mat[i][j]+" ");
				i++;
				j--;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		int[][] mat = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				 mat[i][j] = scan.nextInt();
			}
		}
		antiDiagonal(mat,rows,cols);
	

	}

}
