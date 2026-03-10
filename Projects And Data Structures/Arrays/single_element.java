package basicquestions;
import java.util.*;
public class single_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i<n ; i++)
		{
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);
		for(int i=0 ; i<n;i++)
		{
			if(arr[i]!=arr[i+1]|| i== n-1)
			{
				System.out.print(arr[i]);
				break;
			}
			
			
				i++;
			
		}
		
	}

}
