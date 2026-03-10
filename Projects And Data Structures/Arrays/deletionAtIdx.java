package basicquestions;
import java.util.*;
//	DELETION AT THE INDEX
public class deletionAtIdx {
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
		System.out.println("Enter the no. of values in the array ");
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ;i<n ;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before Deletion :");
		printa(arr);
		System.out.println();
		int[] arr1 = new int[arr.length-1];
		System.out.println("Enter the index of which you want to delete the value : ");
		int indx = sc.nextInt();
		for(int i =0 ; i<arr1.length ; i++)
		{
			if(i<indx)
			{
				arr1[i]=arr[i];
			}
			else
			{
				arr1[i]=arr[i+1];
			}
		}
		arr=arr1;
		System.out.println("Array after deletion : ");
		printa(arr);
		sc.close();
	}

}
