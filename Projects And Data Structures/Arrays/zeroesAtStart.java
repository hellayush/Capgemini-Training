package basicquestions;

//	ZEROS AT THE START
public class zeroesAtStart {
	public static void main(int[] arr)
	{
		int n = arr.length-1;
		for(int i=n ; i>0;i--)
		{
			if(arr[i]!=0)
			{
				arr[n--]=arr[i];
			}
		}
		while(n>=0)
		{
			arr[n--]=0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,23,0,0,22,67,0};
		main(arr);
		for(int x : arr)
		{
			System.out.print(x + " ");
		}
	}

}
