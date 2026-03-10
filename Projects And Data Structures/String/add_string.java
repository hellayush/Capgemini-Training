package string;
import java.util.*;
public class add_string {
	public static String add(String num1, String num2)
	{
		long f = Long.parseLong(num1);
		long s = Long.parseLong(num2);
		long sum = f+s;
		String total = sum + "";
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1044";
		String t = "12";
		String sum = add(s,t);
		System.out.println(sum);
	}

}
