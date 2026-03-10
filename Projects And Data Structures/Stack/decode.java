package Stack_q;
import java.util.*;
public class decode {
	static String encoded = "";
    static String decoded = "";

    
    static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {

            
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            }
            
            else if (ch == '[') {
                countStack.push(k);
                stringStack.push(current);
                current = new StringBuilder();
                k = 0;
            }
            
            else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder prev = stringStack.pop();

                for (int i = 0; i < repeat; i++) {
                    prev.append(current);
                }
                current = prev;
            }
            
            else {
                current.append(ch);
            }
        }
        return current.toString();
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Decode Nested Encoded String ---");
            System.out.println("1. Enter Encoded String");
            System.out.println("2. Decode String");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter encoded string: ");
                    encoded = sc.nextLine();
                    System.out.println("Encoded string saved ");
                    break;

                case 2:
                    if (encoded.isEmpty()) {
                        System.out.println("Please enter a string first!");
                    } else {
                        decoded = decodeString(encoded);
                        System.out.println("Decoded string: " + decoded);
                    }
                    break;

                case 3:
                    System.out.println("Program Exited ");
                    break;

                default:
                    System.out.println("Invalid option ");
            }

        } while (choice != 3);

        sc.close();
}
}