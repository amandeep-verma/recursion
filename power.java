//using recursion with memorization to compute the x^i with time complexity O(log(i))
public class power {
	
	static int a[];
	public static void main(String[] args) {
		a=new int[35];
		for(int i=0;i<a.length;i++)
		{
			a[i]=-1;
		}
		a[0]=1;
		a[1]=2;
		System.out.println(Pow(2,8));
	}

	private static int Pow(int x,int i) {
		if(i<=1)
		{
			return x;
		}
		
		else if(i%2==0)
		{
			if(a[i/2]==-1)
			{
				a[i/2]=Pow(x,i/2);
			}
			return a[i/2] * a[i/2] ;
		}
		
		else
		{
			return x*Pow(x,i-1);
		}
	}
}
