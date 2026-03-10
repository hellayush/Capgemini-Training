package basicquestions;

public class rotate_leftN {
	public static void lefts(int[] arr , int left , int right )
	{
		while(left<right)
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp ;
			left++;
			right--;
		}
	}
	public static void leftt(int[] arr , int d)
	
	{
		lefts(arr,0,d-1);
		lefts(arr,d-1 ,arr.length-1);
		lefts(arr,0,arr.length-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int d= 2;
				
		leftt(arr,d);
		for(int x : arr)
		{
			System.out.print(x + " ");
		}
	}

}
