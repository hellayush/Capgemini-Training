import java.util.*;

public class happy {
    public static int sq(int n)
    {
        int original = n;
        int count =  0;
        Map<Integer,Integer> mp = new HashMap<>();

        while(true)
        {
            int curr = 0;
            int temp = n;

            while (temp != 0)
            {
                int d = temp % 10;
                curr += d * d;
                temp = temp / 10;
            }

            count++;

            if(curr == original) {
                return count;
            }

            if(mp.containsKey(curr)) {
                return -1;
            }

            mp.put(curr, mp.getOrDefault(n,0)+1);

            n = curr;
        }
    }
    public static void main(String[] args)
    {
        int n = 14 ;
        int map = sq(n);
        System.out.println(map);
    }
}