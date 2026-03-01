
public class date_one {
    static void main() {
        String[] s1 = {
             "12-4-1978",
                "21.4.2001","5-6-99","04-11-01"
        };
        for(String s : s1)
        {
            System.out.println(recreate(s));
        }

    }
    public static String recreate(String s11)
    {
        String[] arr = s11.split("^[0-9]+");
        int day = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int yr = Integer.parseInt(arr[2]);
        if (yr < 100) {
            if (yr <= 50)
                yr += 2000;
            else
                yr += 1900;
        }

        return String.format("%02d%02d%04d", day, month, yr);
    }
}
