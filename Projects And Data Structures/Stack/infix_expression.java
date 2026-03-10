package basic;
import java.util.Stack;
public class infix_expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "9+3-5*2/6";
		Stack<Integer> val = new Stack<>();
		Stack<Character> op = new Stack<>();
		
		for(int i = 0  ;i <str.length() ; i++)
		{
			char ch = str.charAt(i);
			int no = (int)ch;
			
			if(no>=48 && no<=57)
			{
				val.push(no-48);
			}
			else if(op.size()==0) op.push(ch);
			else
			{
				if(ch=='+' || ch=='-')
				{
					int v2 = val.pop();
					int v1 = val.pop();
					if(op.peek()=='+') val.push(v1+v2);
					if(op.peek()=='-') val.push(v1-v2);
					if(op.peek()=='*') val.push(v1*v2);
					if(op.peek()=='/') val.push(v1/v2);
					op.pop();
					op.push(ch);
				}
				if(ch=='*' || ch=='/') {
					if(op.peek()=='*' || op.peek()=='/')
					{
					int v2 = val.pop();
					int v1 = val.pop();
					if(op.peek()=='*') val.push(v1*v2);
					if(op.peek()=='/') val.push(v1/v2);
					op.pop();
					op.push(ch);
					}
					else op.push(ch);
				}
				
			}
		}
			while(val.size()>1)
			{
				int v2 = val.pop();
				int v1 = val.pop();
				if(op.peek()=='+') val.push(v1+v2);
				if(op.peek()=='-') val.push(v1-v2);
				if(op.peek()=='*') val.push(v1*v2);
				if(op.peek()=='/') val.push(v1/v2);
				op.pop();
			}
		
		System.out.println(val.peek());
	}

}
