package basicquestions;
import java.util.*;
public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.MIN_VALUE;
		int b = Integer.MAX_VALUE;
		int[] arr = {2,3,4,5,6,7};
		int second=Integer.MIN_VALUE;
		for(int i=0 ; i<arr.length;i++)
		{
			if(arr[i]>a)
			{
				second =a;
				a=arr[i];
			}
			
			if(arr[i]!=a && arr[i]<second) {
				second=arr[i];
			}
		}
		System.out.println("Largest val " + a);
		
		
		
		System.out.println(second);
	}

}
