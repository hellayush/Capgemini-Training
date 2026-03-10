package basicquestions;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 4 ;
		for(int r = 0 ; r<n; r++)
		{
			char cg = 'A';
			for(int s =0 ; s<r ; s++)
			{
				System.out.print(" ");
			}
			for(int c =0 ; c<2*(n-r)-1; c++)
			{
				System.out.print(cg);
				cg++;
			}
			System.out.println();
		}
	}

}
