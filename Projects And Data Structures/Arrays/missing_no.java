package basicquestions;
import java.util.*;
public class missing_no {
	public static int miss(int[] arr , int n)
	{
		int sum = n*(n+1)/2;
		int actual = 0;
		for(int x : arr)
		{
			actual+=x;
		}
		return sum-actual;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5};
		int n = arr[arr.length-1];
		int miss = miss(arr,n);
		System.out.println(miss);
	}

}
