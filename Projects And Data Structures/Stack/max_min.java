package Stack_q;
import java.util.*;
public class max_min {


    Stack<Integer> stack = new Stack<>();
    int min, max;

    
    void push(int x) {
        if (stack.isEmpty()) {
            min = max = x;
            stack.push(x);
            System.out.println(x + " pushed");
            return;
        }

        if (x < min) {
            stack.push(2 * x - min);
            min = x;
        } 
        else if (x > max) {
            stack.push(2 * x - max);
            max = x;
        } 
        else {
            stack.push(x);
        }
        System.out.println(x + " pushed");
    }

    
    void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        int top = stack.pop();

        if (top < min) {
            System.out.println("Popped: " + min);
            min = 2 * min - top;
        } 
        else if (top > max) {
            System.out.println("Popped: " + max);
            max = 2 * max - top;
        } 
        else {
            System.out.println("Popped: " + top);
        }
    }

    
    int getMin() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return min;
    }

    
    int getMax() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return max;
    }

    
    void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack elements (top → bottom): ");

        int currentMin = min;
        int currentMax = max;

        
        for (int i = stack.size() - 1; i >= 0; i--) {
            int val = stack.get(i);

            if (val < currentMin) {
                System.out.print(currentMin + " ");
                currentMin = 2 * currentMin - val;
            }
            else if (val > currentMax) {
                System.out.print(currentMax + " ");
                currentMax = 2 * currentMax - val;
            }
            else {
                System.out.print(val + " ");
            }
        }
        System.out.println();
    }

    // MAIN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        max_min s = new max_min();
        int choice;

        do {
            System.out.println("\n--- Stack with O(1) Min & Max ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Get Minimum");
            System.out.println("4. Get Maximum");
            System.out.println("5. Display Stack");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int x = sc.nextInt();
                    s.push(x);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    System.out.println("Minimum: " + s.getMin());
                    break;

                case 4:
                    System.out.println("Maximum: " + s.getMax());
                    break;

                case 5:
                    s.display();
                    break;

                case 6:
                    System.out.println("Program Exited ✅");
                    break;

                default:
                    System.out.println("Invalid option ❌");
            }

        } while (choice != 6);

        sc.close();
    }}