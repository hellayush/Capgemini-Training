package basicquestions;

public class matrix_diagonal_sum {
	public static int sum(int[][] mat)
	{
		int all_sum=0;
		int n = mat.length;
		for(int i =0 ;i<n;i++)
		{
			for(int j =0 ;j<mat[0].length;j++)
			{
				if(i==j ) 
				{
					all_sum += mat[i][j];
				}
				else if (i+j==n-1)
				{
					all_sum += mat[i][j];
				}
				 else if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
	                    all_sum += mat[i][j];
				 }}
		}
		return all_sum;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int sum = sum(arr);
		System.out.println(sum);
	}

}
