package Stack_q;
import java.util.*;
public class two_que {
	  static class CostlyPushStack {
	        Queue<Integer> q1 = new LinkedList<>();
	        Queue<Integer> q2 = new LinkedList<>();

	        void push(int x) {
	            q2.add(x);
	            while (!q1.isEmpty())
	                q2.add(q1.remove());

	            Queue<Integer> temp = q1;
	            q1 = q2;
	            q2 = temp;

	            System.out.println(x + " pushed");
	        }

	        void pop() {
	            if (q1.isEmpty()) {
	                System.out.println("Stack is empty");
	                return;
	            }
	            System.out.println("Popped: " + q1.remove());
	        }
	    }

	    
	    static class CostlyPopStack {
	        Queue<Integer> q1 = new LinkedList<>();
	        Queue<Integer> q2 = new LinkedList<>();

	        void push(int x) {
	            q1.add(x);
	            System.out.println(x + " pushed");
	        }

	        void pop() {
	            if (q1.isEmpty()) {
	                System.out.println("Stack is empty");
	                return;
	            }

	            while (q1.size() > 1)
	                q2.add(q1.remove());

	            System.out.println("Popped: " + q1.remove());

	            Queue<Integer> temp = q1;
	            q1 = q2;
	            q2 = temp;
	        }
	    }

	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Choose Method:");
	        System.out.println("1. Costly Push");
	        System.out.println("2. Costly Pop");
	        int method = sc.nextInt();

	        int choice;
	        if (method == 1) {
	            CostlyPushStack s = new CostlyPushStack();
	            do {
	                System.out.println("\n1. Push\n2. Pop\n3. Exit");
	                choice = sc.nextInt();

	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter value: ");
	                        s.push(sc.nextInt());
	                        break;
	                    case 2:
	                        s.pop();
	                        break;
	                }
	            } while (choice != 3);
	        } 
	        else {
	            CostlyPopStack s = new CostlyPopStack();
	            do {
	                System.out.println("\n1. Push\n2. Pop\n3. Exit");
	                choice = sc.nextInt();

	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter value: ");
	                        s.push(sc.nextInt());
	                        break;
	                    case 2:
	                        s.pop();
	                        break;
	                }
	            } while (choice != 3);
	        }

	        sc.close();
}
}
