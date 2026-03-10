package collections;
import java.util.*;
public class MIN_MAX {
	 Stack<Long> stack = new Stack<>();
	    long min, max;

	    
	    void push(long x) {
	        if (stack.isEmpty()) {
	            stack.push(x);
	            min = max = x;
	        }
	        else if (x < min) {
	            stack.push(2*x - min); 
	            min = x;
	        }
	        else if (x > max) {
	            stack.push(2*x - max); 
	            max = x;
	        }
	        else {
	            stack.push(x);
	        }
	    }

	    
	    void pop() {
	        if (stack.isEmpty()) {
	            System.out.println("Stack is empty");
	            return;
	        }

	        long top = stack.pop();

	        if (top < min) {
	            min = 2*min - top; 
	        }
	        else if (top > max) {
	            max = 2*max - top; 
	        }
	    }

	    long getMin() {
	        return min;
	    }

	    long getMax() {
	        return max;
	    }

	    public static void main(String[] args) {
	    	MIN_MAX s = new MIN_MAX();

	        s.push(10);
	        s.push(5);
	        s.push(20);
	        s.push(3);

	        System.out.println("Min: " + s.getMin()); 
	        System.out.println("Max: " + s.getMax()); 

	        s.pop();
	        System.out.println("Min after pop: " + s.getMin()); 
}
}