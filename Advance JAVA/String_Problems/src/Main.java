import java.util.ArrayList;

public class Main
        {
void main() {
    String s = new String("this is line. Line contains few words. Line is in java");

    ArrayList<Integer> l1 = new ArrayList<>();
    char[] arr1 = s.toCharArray();
    for(int i= 0 ; i<s.length(); i++)
    {
        char c = arr1[i];

        if (c == 'l' || c == 'L') {
            if ((arr1[i + 1] == 'i' || arr1[i + 1] == 'I') &&
                    (arr1[i + 2] == 'n' || arr1[i + 2] == 'N') &&
                    (arr1[i + 3] == 'e' || arr1[i + 3] == 'E')) {

                l1.add(i);
            }
        }
    }

    System.out.println(l1);
    }
}
