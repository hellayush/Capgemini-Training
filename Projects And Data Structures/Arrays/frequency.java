package basicquestions;
import java.util.*;
public class frequency {
	public static void array(int[] arr )
	{
		boolean[] visit = new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{ 
			if(visit[i]) continue;
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					visit[j]=true;
				}
				
			}
			System.out.println(arr[i] +" appeared " + count + " times");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,33,22,22,44,44};
		
		array(arr);
	}

}
