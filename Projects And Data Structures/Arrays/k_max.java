package basicquestions;
import java.util.*;
public class k_max {
	public static int kmax(int[] arr , int k)
	{
		int unique = 0 ; int last = Integer.MIN_VALUE;
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=last)
			{
				unique++;
				last=arr[i];
			}
			if(unique==k)
			{
				return last;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,43,23,56,67,11,22};
		int k=2;
		int ke  = kmax(arr,k);
		System.out.println("The K max elements is " + ke);
	}

}
