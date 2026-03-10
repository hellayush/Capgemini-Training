package basicquestions;

public class highest_altitude {
	public static int altitude(int[] arr)
	{
		int[] pref = new int[arr.length+1];
		pref[0]=0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			pref[i+1]= arr[i]+pref[i];
		}
		arr=pref;
		for(int i =0 ; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-5,1,5,0,-7};
		int max_altitude = altitude(arr);
		System.out.println(max_altitude);
	}

}
