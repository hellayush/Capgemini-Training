package basicquestions;
import java.util.*;
//	DELETION AT THE STARTING
public class deletionAtStart {
	public static void printa(int[] arr)
	{
		for(int  i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of values you wanna enter in the array ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before deletion ");
		printa(arr);
		System.out.println();
		int[] arr1 = new int[arr.length-1];
		System.out.println("----------------------------------------------");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=arr[i+1];
		}
		arr=arr1;
		System.out.println("Array after deletion ");
		printa(arr);
		sc.close();
	}

}
