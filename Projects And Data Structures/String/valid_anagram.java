package string;
import java.util.*;
public interface valid_anagram {
	public static boolean is_anagram(String s , String p)
	{
		
		if(s.length()!=p.length()){
			return false;
		}
		int[] freq = new int[26];
		int[] freq1 = new int[26];
		
		for(int i=0 ; i<s.length();i++)
		{
			freq[s.charAt(i)-'a']++;
			freq1[p.charAt(i)-'a']++;
		
	}
		for(int i=0;i<freq.length;i++)
		{
		if(freq[i]!=freq1[i])
		{
			return false;
		}
		}
		return true;
	}

	public static void main(String[] args)
	{
		String s= "anagram";
		String p ="nagaram";
		boolean s1 = is_anagram(s,p);
		System.out.println(s1);
		
	}
}
