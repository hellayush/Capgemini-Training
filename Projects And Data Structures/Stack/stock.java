package Stack_q;
import java.util.*;
public class stock {
	 static int[] calculateSpan(int[] price, int n) {
	        int[] span = new int[n];
	        Stack<Integer> stack = new Stack<>();

	        
	        span[0] = 1;
	        stack.push(0);

	        for (int i = 1; i < n; i++) {
	            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
	                stack.pop();
	            }

	            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
	            stack.push(i);
	        }
	        return span;
	    }

	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of days: ");
	        int n = sc.nextInt();

	        int[] prices = new int[n];
	        System.out.println("Enter stock prices:");
	        for (int i = 0; i < n; i++) {
	            prices[i] = sc.nextInt();
	        }

	        int[] span = calculateSpan(prices, n);

	        System.out.print("Stock Span: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(span[i] + " ");
	        }

	        sc.close();
}
}
