package basicquestions;

public class single2 {

	public static int single(int[] arr)
	{
		
		int n = arr.length;
		for(int i=0;i<n ; i++)
		{
			int j;
			for( j=0 ; j<n ; j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					break;
				}
			}
			if(j==n)
			{
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {2,2,3,4,4};
		int s =single(arr);
		System.out.println(s);
		// TODO Auto-generated method stub
}
		
		}


