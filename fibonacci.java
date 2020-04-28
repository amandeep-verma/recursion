//classical recursion for Fibonacci series takes a lot of time since recursion calls for fib(a-1) and fib(a-2) 
//for fib(a-1), we will recursively call fib(a-2), and for it fib(a-3) and so on.
//Here even when fib(a-2),fib(a-3),.....,1 has been calculated for fib(a-1), it will be calculated again for fib(a-2). 
//This increases the time complexity of the program. To avoid that we use recursion with memorization technique.

public class fibonacci {
// array b stores the fib() of each number so it can used again rather than computing it again

	static int b[];
	public static void main(String[] args) {
		int a=48;
		b=new int[52];
		for(int i=0;i<b.length;i++)
		{
			b[i]=-1;
		}
		b[0]=0;
		b[1]=1;
		
		System.out.println(fib(a));
	}

	private static int fib(int a) {

		if(b[a]!= -1)
		{
			return b[a];
		}

		b[a]= fib(a-1)+fib(a-2);
		return b[a];
	}

}
