package basicquestions;

//	MOVE ZEROS TO END OF THE ARRAY
public class zerostoend {
	public static void end(int[] arr)
	{
		int j = 0;
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]!=0)
			{
				arr[j++]=arr[i];
				
			}		
		}
		while(j<arr.length)
		{
			arr[j++]=0;
		}
		for(int i=0 ; i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,0,3,0,0,22};
		end(arr);
		
	
	}

}
