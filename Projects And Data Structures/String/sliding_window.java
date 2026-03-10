package string;
import java.util.*;
public class sliding_window {

	public static int longest(String s )
	{
		boolean[] visit = new boolean[256];
		int i = 0 ;
		int j=0;
		int max = 0;
		while(j<s.length()){
			while(visit[s.charAt(j)])		//ID ALREADY IN WINDOW THEN 
			{								//THEN FALSE
				visit[s.charAt(i)]=false;
				i++;
			}
			visit[s.charAt(j)]=true;	//BY DEAFAULT IT IS FALSE [THEN TAKES INTO THE WINDOW]
			j++;
			max = Math.max(max,j-i);
		}
		return max;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		int ss = longest(s);
		System.out.println(ss);
	}
}
