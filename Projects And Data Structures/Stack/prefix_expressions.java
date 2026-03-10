package basic;
import java.util.Stack;

public class prefix_expressions {

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> f = new Stack<>();
        Stack<Character> c = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int no = (int) ch;

            if (no >= 48 && no <= 57) {
                String m = "" + ch;
                f.push(m);
            } else if (c.size() == 0 || ch == '(' || c.peek() == '(') {
                c.push(ch);
            } else if (ch == ')') {
                while (c.peek() != '(') {
                    String v2 = f.pop();
                    String v1 = f.pop();
                    char o = c.pop();
                    String t = o + v1 + v2; 
                    f.push(t);
                }
                c.pop(); 
            } else {
                if (ch == '+' || ch == '-') {
                    String v2 = f.pop();
                    String v1 = f.pop();
                    String t = ch + v1 + v2; 
                    f.push(t);
                    c.pop(); 
                } else if (ch == '*' || ch == '/') {
                    if (c.peek() == '*' || c.peek() == '/') {
                        String v2 = f.pop();
                        String v1 = f.pop();
                        String t = ch + v1 + v2; 
                        f.push(t);
                        c.pop();
                    } else {
                        c.push(ch);
                    }
                }
            }
        }

        
        while (!c.isEmpty()) {
            String s2 = f.pop();
            String s1 = f.pop();
            char o = c.pop();
            String st = o + s1 + s2;
            f.push(st);
        }

        
        String pre = f.pop();
        System.out.println(pre);
    }
}
