package basic;
import java.util.Stack;
public class stock_span_problem {
	public static int[] stock(int[] arr , int n)
	{
		int[] res = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		res[0]=1;
		st.push(0);
		for(int i =1 ; i<n ; i++)
		{
			while(st.size()>0 && arr[st.peek()]<=arr[i])
			{
				st.pop();
			}
			if(st.size()==0) res[i]= i+1;
			else
			{
				res[i] = i-st.peek();
			}
			st.push(i);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,80,60,70,75,85};
		int[] res = stock(arr,arr.length);
		
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
