package basicquestions;

public class product_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,1,6};
		int[] res = new int[arr.length];
		for(int i=0 ; i<arr.length ; i++)
		{
			int prod =1;
			for(int j=0 ; j<arr.length;j++)
			{
				if(i!=j)
				{
					prod *= arr[j];
					
				}
			}
			res[i]=prod;
		}
		arr=res;
		for(int x:arr)
		{
			System.out.print(x + " ");
		}
	}

}
