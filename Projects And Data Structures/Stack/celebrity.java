package Stack_q;
import java.util.*;
public class celebrity {
	static boolean knows(int[][] M, int a, int b) {
        return M[a][b] == 1;
    }

    static int findCelebrity(int[][] M, int n) {
        Stack<Integer> stack = new Stack<>();

        // Step 1: Push all people
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // Step 2: Eliminate non-celebrities
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();

            if (knows(M, a, b))
                stack.push(b);
            else
                stack.push(a);
        }

        // Step 3: Verify
        int candidate = stack.pop();

        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                if (M[candidate][i] == 1 || M[i][candidate] == 0)
                    return -1;
            }
        }
        return candidate;
    }

    // MAIN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        int[][] M = new int[n][n];
        System.out.println("Enter matrix:");

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                M[i][j] = sc.nextInt();

        int result = findCelebrity(M, n);

        if (result == -1)
            System.out.println("No Celebrity Found");
        else
            System.out.println("Celebrity is person: " + result);

        sc.close();
}
}
