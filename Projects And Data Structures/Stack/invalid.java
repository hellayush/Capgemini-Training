package Stack_q;
import java.util.*;
public class invalid {
	   static String removeInvalid(String s) {
	        Stack<Integer> stack = new Stack<>();
	        boolean[] remove = new boolean[s.length()];

	        // Step 1: Identify invalid parentheses
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);

	            if (ch == '(') {
	                stack.push(i);
	            } 
	            else if (ch == ')') {
	                if (stack.isEmpty()) {
	                    remove[i] = true; // invalid ')'
	                } else {
	                    stack.pop();
	                }
	            }
	        }

	        // Step 2: Remaining '(' are invalid
	        while (!stack.isEmpty()) {
	            remove[stack.pop()] = true;
	        }

	        // Step 3: Build result
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < s.length(); i++) {
	            if (!remove[i]) {
	                result.append(s.charAt(i));
	            }
	        }
	        return result.toString();
	    }

	    // MAIN
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter string: ");
	        String input = sc.nextLine();

	        String output = removeInvalid(input);

	        System.out.println("Valid string: " + output);

	        sc.close();
}
}
