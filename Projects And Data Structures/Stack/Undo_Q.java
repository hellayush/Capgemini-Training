package Stack_q;
import java.util.*;

public class Undo_Q {

    static String infix = "";
    static String postfix = "";
    static Stack<Integer> history = new Stack<>();

    
    static boolean isValid(String exp) {
        Stack<Character> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {
            if (ch == '(') stack.push(ch);
            else if (ch == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
            else if (!Character.isDigit(ch) && "+-*/".indexOf(ch) == -1) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    
    static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder post = new StringBuilder();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isDigit(ch)) {
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    post.append(exp.charAt(i++));
                }
                post.append(" ");
                i--;
            }
            else if (ch == '(') stack.push(ch);
            else if (ch == ')') {
                while (stack.peek() != '(')
                    post.append(stack.pop()).append(" ");
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch))
                    post.append(stack.pop()).append(" ");
                stack.push(ch);
            }
        }

        while (!stack.isEmpty())
            post.append(stack.pop()).append(" ");

        return post.toString();
    }

    
    static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (String token : exp.split(" ")) {
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (token.charAt(0)) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }

    // MAIN MENU
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Expression Evaluation Engine ---");
            System.out.println("1. Enter & Validate Expression");
            System.out.println("2. Convert Infix to Postfix");
            System.out.println("3. Evaluate Expression");
            System.out.println("4. UNDO Last Result");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Infix Expression: ");
                    infix = sc.nextLine().replaceAll(" ", "");
                    if (isValid(infix))
                        System.out.println("Expression is VALID ✅");
                    else
                        System.out.println("Expression is INVALID ❌");
                    break;

                case 2:
                    if (infix.isEmpty()) {
                        System.out.println("Enter expression first!");
                    } else {
                        postfix = infixToPostfix(infix);
                        System.out.println("Postfix Expression: " + postfix);
                    }
                    break;

                case 3:
                    if (postfix.isEmpty()) {
                        System.out.println("Convert expression first!");
                    } else {
                        int result = evaluatePostfix(postfix);
                        history.push(result);
                        System.out.println("Result: " + result);
                    }
                    break;

                case 4:
                    if (history.size() > 1) {
                        history.pop();
                        System.out.println("After UNDO Result: " + history.peek());
                    } else {
                        System.out.println("No previous result");
                    }
                    break;

                case 5:
                    System.out.println("Program Exited ✅");
                    break;

                default:
                    System.out.println("Invalid Option ❌");
            }
        } while (choice != 5);

        sc.close();
    }}