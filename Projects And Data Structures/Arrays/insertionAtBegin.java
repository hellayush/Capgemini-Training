package basicquestions;
import java.util.*;
// INSERTION IN THE BEGINNING
public class insertionAtBegin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println("Enter the value to be inserted at the Begining :  ");
		int value = sc.nextInt();
		
		int[] newarr = new int[arr.length+1];
		newarr[0]=value;
		for(int i =0 ; i<arr.length; i++)
		{
			newarr[i+1]=arr[i];
		}
		
		arr=newarr;
		System.out.println("Array After insertion in the starting is : ");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
