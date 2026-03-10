package basicquestions;

public class no_ofprimes {
	public static int prime(int n)
	{ int ans=0 ;
		if(n<2) return 0;
		int[] a = new int[n];
		for(int i = 2 ; i<=Math. sqrt(n); i++ )
		{
			if(a[i]==0)
			{
				for(int j = i*i ; j< n ; j+=i)
				{
					a[j]=1;
				}
			}
		}
		
		for(int i = 2 ; i<n ;i++)
		{
			if(a[i]==0) ans++;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30;
		int ans = prime(n);
		System.out.println(ans);
	}

}
