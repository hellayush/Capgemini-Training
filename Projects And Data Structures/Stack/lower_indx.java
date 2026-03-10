package basic;
import java.util.*;
public class lower_indx {
	public static void revbot(Stack<Integer> st,int indx , int val)
	{
		if(st.size()==indx)
		{
			int in = st.push(val);
			return;
		}
		int top = st.pop();
		revbot(st,indx,val);
		st.push(top);
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> sc = new Stack<>();
		sc.push(1);
		sc.push(2);
		sc.push(3);
		sc.push(4);
		System.out.println(sc);
		revbot(sc , 2 , 66);
		System.out.println(sc);
	}

}
