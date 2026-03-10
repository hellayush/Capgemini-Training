package basicquestions;
import java.util.*;
// 	INSERTION IN THE MIDDLE OF AN ARRAY
public class insrtionAtMiddle {

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
		System.out.println();
			System.out.println("Enter the element to be inserted : ");
				int value = sc.nextInt();
				System.out.println("Enter the index you want to enter the element : ");
				int ind = sc.nextInt();
				int[] arr1 = new int[arr.length+1];
				arr1[ind]=value;
				for(int i=0 ; i<arr.length ; i++)
				{
					if(i<ind)
					{
						arr1[i]=arr[i];
					}
					else
					{
						arr1[i+1]=arr[i];
					}
				}
				arr=arr1;
				System.out.println("Array After insertion on the provided index is : ");
				for(int i=0 ; i<arr.length ; i++)
				{
					System.out.print(arr[i] + " ");
				}
				sc.close();
				
	}

}
