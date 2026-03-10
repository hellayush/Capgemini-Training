package basicquestions;
import java.util.*;
// DELETION AT THE END 
public class deletionAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before insertion : ");
		for(int i =0 ; i<n ; i++)
			{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		int[] arr1 = new int[arr.length-1];
		for(int i =0 ; i<arr1.length ; i++)
		{
			arr1[i]=arr[i];
		}
		arr=arr1;
		System.out.println("Array After deletion at the end is : ");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
