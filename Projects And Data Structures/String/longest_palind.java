package string;

public class longest_palind {
	public static int longe(String s)
	{
		int c= 0; int odd= 0;
		int freq[] = new int[26];
		
		for(int i =0;i<s.length();i++ )
		{
			freq[s.charAt(i)-'a']++;
			
		}
		for(int i =0 ; i<freq.length ; i++)
		{
		if(freq[i]%2==0)
		{
			c+=freq[i];
		}
		else
		{
			c+=(freq[i]-1);
			odd=1;
			
		}
		
		}
		
		return c+odd;
	}
	public static void main(String[] args)
	{
		String a= "abccccdd";
		int c = longe(a);
		System.out.println(c);
	}
}
