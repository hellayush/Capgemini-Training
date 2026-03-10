package basicquestions;

public class trapping_water {
	public static int trapping(int[] arr)
	{
		int n= arr.length;
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		
		left[0]=0;
		right[arr.length-1]=0;
		for(int i=1;i<n;i++)
		{
			left[i]=Math.max(arr[i-1], left[i-1]);
		}
		for(int j=arr.length-2;j>=0;j--)
		{
			right[j]=Math.max(arr[j+1], right[j+1]);
		}
		int waterstore=0;
		for(int i =0 ; i<n ; i++)
		{
			int min = Math.min(left[i], right[i]);
			if(min>arr[i] ){
			waterstore += min-arr[i];
			}
			
		}
		return waterstore;
	}
	public static int trapping1(int[] arr)
	{
		int left =-1;
		int max= 0;
		int ind =0;
		int right = -1;
		for(int i=0 ; i < arr.length ; i++)
		{
			if(arr[i]>max)
			{
				max =arr[i];
				ind = i;
			}
		}
		int waterstore =0;
		for(int i=0 ;i<arr.length;i++)

	{
			if(arr[i]<left)
			{
				waterstore+=left=arr[i];
			}
			else
			{
				left=arr[i]; 
			}
	}
		for(int i =arr.length-1;i>ind;i--)
		{
			if(arr[i]<right)
			{
				waterstore+=right-arr[i];
			}
			else
			{
				right=arr[i];
			}
		}
		return waterstore;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
			int water = trapping1(arr);
			System.out.println(water);
	}

}
