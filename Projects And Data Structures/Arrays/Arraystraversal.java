package basicquestions;
import java.util.*;
// Traversal of 1-d arrays
public class Arraystraversal {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements you want in your array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			System.out.print("Enter the " + i+1 + " value : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements that you entered are : ");
		for(int i=0 ; i<n ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		sc.close();
}
}
