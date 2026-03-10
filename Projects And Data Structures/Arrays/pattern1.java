package basicquestions;
import java.util.*;
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int row = sc.nextInt();
	
		int col =(row+1)/2;
		int s =1;
		for(int i =1 ; i<=row ; i++)
		{
			for(int j=1 ; j<=s; j++)
			{
				System.out.print(j);			
		}
			System.out.println();
		if(i<col)
		{
			s++;
		}
		else
		{
			s--;
		}
		
	}

}
}
