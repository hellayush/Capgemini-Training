package basicquestions;

public class Splitarray {

	  public static boolean canSplit(int arr[]) {
	        // code here
	        int n = arr.length;
	        for(int i=0 ;i<n-2;i++)
	        {
	            int sum1= 0 ; int sum2=0;
	            for(int j=0;j<=i;j++)
	            {
	               sum1+=arr[j]; 
	            }
	            for(int j=i+1;j<n-1;j++)
	            {
	                sum2+=arr[j];
	            }
	            if(sum1==sum2)
	            {
	                return true;
	            }
	        }
	        return false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};
		boolean a = canSplit(arr);
		System.out.print(a);
	}

}
