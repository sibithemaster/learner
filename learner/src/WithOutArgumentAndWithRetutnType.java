import java.util.Scanner;

public class WithOutArgumentAndWithRetutnType 
{	
	public String checkOddOrEven()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();		
		if(num%2==0)
		{
			return "Even number";
		}else {
			return "Odd number";
		}			
	}
	
	public static void main(String[] args) 
	{
		WithOutArgumentAndWithRetutnType onlyReturn = new WithOutArgumentAndWithRetutnType();		
		System.out.println(onlyReturn.checkOddOrEven());
	}

}
