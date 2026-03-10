package collections;
import java.util.*;
public class Stock {
	 static int[] stockSpan(int[] price, int n) {
	        int[] span = new int[n];
	        Stack<Integer> stack = new Stack<>();

	        
	        stack.push(0);
	        span[0] = 1;

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

	        int[] price = new int[n];
	        System.out.println("Enter stock prices:");
	        for (int i = 0; i < n; i++) {
	            price[i] = sc.nextInt();
	        }

	        int[] span = stockSpan(price, n);

	        System.out.println("Stock Span:");
	        for (int s : span) {
	            System.out.print(s + " ");
	        }
	    }
	}

