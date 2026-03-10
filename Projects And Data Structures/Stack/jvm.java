package Stack_q;
import java.util.*;
public class jvm {
	 static Stack<String> callStack = new Stack<>();

	    static void callMethod(String method) {
	        callStack.push(method);
	        System.out.println("Method called: " + method);
	        displayStack();
	    }

	    static void returnMethod() {
	        if (callStack.isEmpty()) {
	            System.out.println("No method to return from!");
	            return;
	        }
	        String method = callStack.pop();
	        System.out.println("Returning from: " + method);
	        displayStack();
	    }

	    static void displayStack() {
	        System.out.println("Current Call Stack:");
	        if (callStack.isEmpty()) {
	            System.out.println("[ empty ]");
	            return;
	        }
	        for (int i = callStack.size() - 1; i >= 0; i--) {
	            System.out.println("| " + callStack.get(i) + " |");
	        }
	    }

	    // MAIN
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- JVM Call Stack Simulation ---");
	            System.out.println("1. Call Method");
	            System.out.println("2. Return Method");
	            System.out.println("3. Display Call Stack");
	            System.out.println("4. Exit");
	            System.out.print("Choose option: ");

	            choice = sc.nextInt();
	            sc.nextLine(); // clear buffer

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter method name: ");
	                    String method = sc.nextLine();
	                    callMethod(method);
	                    break;

	                case 2:
	                    returnMethod();
	                    break;

	                case 3:
	                    displayStack();
	                    break;

	                case 4:
	                    System.out.println("Program Exited ✅");
	                    break;

	                default:
	                    System.out.println("Invalid option ❌");
	            }

	        } while (choice != 4);

	        sc.close();
}
}
