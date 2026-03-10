package basicquestions;
import java.util.*;
// 	INSERION AT THE LAST OF THE ARRAY
public class insertionAtLast {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value :");
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i =0 ; i<n  ; i++)
	{
		arr[i]= sc.nextInt();
	}
	
	System.out.println("Array before insertion : ");
	for(int i =0 ; i<n ; i++)
		{
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	int[] newarray = new int[arr.length+1];
	System.out.println("Enter the value you want to e inserted at the end");
	int value = sc.nextInt();
	
	for(int i=0 ; i<arr.length;i++)
	{
		newarray[i]=arr[i];
	}
	newarray[newarray.length-1]=value;
	arr=newarray;
	System.out.println("Array After insertion in the end is : ");
	for(int i=0 ; i<arr.length ; i++)
	{
		System.out.print(arr[i] + " ");
	}
	sc.close();
	}
	
}
