package Stack_q;
import java.util.*;
public class histogram {
	 static int largestRectangleArea(int[] heights) {
	        Stack<Integer> stack = new Stack<>();
	        int maxArea = 0;
	        int i = 0;

	        while (i < heights.length) {
	            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
	                stack.push(i++);
	            } else {
	                int top = stack.pop();
	                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
	                int area = heights[top] * width;
	                maxArea = Math.max(maxArea, area);
	            }
	        }

	        
	        while (!stack.isEmpty()) {
	            int top = stack.pop();
	            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
	            int area = heights[top] * width;
	            maxArea = Math.max(maxArea, area);
	        }

	        return maxArea;
	    }

	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of bars: ");
	        int n = sc.nextInt();

	        int[] heights = new int[n];
	        System.out.println("Enter bar heights:");
	        for (int i = 0; i < n; i++) {
	            heights[i] = sc.nextInt();
	        }

	        int result = largestRectangleArea(heights);
	        System.out.println("Largest Rectangle Area: " + result);

	        sc.close();
}
}
