package basicquestions;

public class rotate_left {

	public static void left(int[] arr)
	{
		int n = arr.length;
		int temp = arr[0];
		for(int i=1; i<n ; i++)
		{
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		left(arr);
		for(int x : arr)
		{
			System.out.print(x + " ");
		}
	}

}
