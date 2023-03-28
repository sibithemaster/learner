
public class WithArgumentAndWithRetutnType 
{
	public static void main(String[] args) 
	{
		WithArgumentAndWithRetutnType  both = new WithArgumentAndWithRetutnType();

		System.out.println(both.multiplicationOfTwoNumbers(200, 2));
	}	
	public int multiplicationOfTwoNumbers(int c,int d)
	{
		//200*2
		int a=c*d;
		//stored values are on method
		return a;		
	}

}
