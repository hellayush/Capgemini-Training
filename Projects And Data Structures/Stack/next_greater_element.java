package basic;
import java.util.Stack;
public class next_greater_element {
	public static int[] next(int[] arr)
	{
		int n = arr.length;
		Stack<Integer> st = new Stack<>();
		int[] res= new int[n];
		res[n-1]=-1;
		st.push(arr[n-1]);
		for(int i = n -2; i>=0 ; i--)
		{
			res[i] = -1;
			while( st.size()>0 && st.peek()<arr[i]  )
			{
				st.pop();			}
		    
		if(st.size()==0) res[i] = -1;
		else
		{
			res[i] = st.peek();
		}
		st.push(arr[i]);
		
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,2,1,8,6,3,4};
		int[] res = next(arr);
		
		for(int i =0 ; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i =0 ; i<res.length; i++)
		{
			System.out.print(res[i] + " ");
		}
	}

}
