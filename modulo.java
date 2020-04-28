// Program to have (i^j)%d , where i^j is very bug number. Bigger than what can be stored in int or double.
// We do it with recursion using the property (i^j)%d = (i%d * (i^(j-1))%d)%d

public class modulo {

	static int imod[];
	public static void main(String[] args) {
		imod=new int[40];
		for(int a=0;a<imod.length;a++)
		{
			imod[a]=-1;
		}
		imod[0]=1;
		System.out.println(modulo(5,35,7));

	}

	private static int modulo(int i, int j, int d) {
		
		if(j==0)
			return 1;
		
		if(j%2==0)
		{
			if(imod[j/2]==-1)
			{
				imod[j/2]=modulo(i,j/2,d);
			}
			return (imod[j/2]*imod[j/2])%d;
		}
		else
		{
			imod[j-1]= modulo(i,j-1,d);
			return (i%d*imod[j-1])%d;
		}
	}

}
