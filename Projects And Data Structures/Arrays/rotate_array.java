package basicquestions;
import java.util.*;
public class rotate_array {
//	public static void rotate(int[] arr , int k)
//	{
//		int n = arr.length;
//		while(k--!=0)
//		{
//			int temp = arr[arr.length-1];
//			for(int i = n-2; i>=0;i--)
//			{
//				arr[i+1]=arr[i];
//			}
//			arr[0]=temp;
//			
//		}
//		System.out.println();
//		for(int x : arr)
//		{
//			System.out.print(x + " ");
//		}
//		
//	}
	public static void rotate1(int[] arr , int k)
	{
		int n = arr.length;
		int[] temp = new int[n];
		for(int i =0 ; i <arr.length;i++)
		{
			
			 temp[(i+k)%n]=arr[i];
		}
		System.out.println(Arrays.toString(temp));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int k =3;
		rotate1(arr,k);
	}

}
