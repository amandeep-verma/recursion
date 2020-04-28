//using recursion for factorial

public class factorial {

	public static void main(String[] args) {
		int d=5;
		System.out.println(fact(d));

	}

	private static int fact(int d) {
		
		if (d==1 || d==0)
			return 1;

		return d*fact(d-1);
	}

}
