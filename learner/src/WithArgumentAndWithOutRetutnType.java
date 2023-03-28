import java.util.Scanner;

public class WithArgumentAndWithOutRetutnType {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a");
		int a=sc.nextInt();
		System.out.println("Enter value for b");
		int b=sc.nextInt();

		WithArgumentAndWithOutRetutnType  withArgument = new WithArgumentAndWithOutRetutnType();

		withArgument.subtractionOfTwoNumbers(a, b);
	}

	public void subtractionOfTwoNumbers(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
		//return
	}

}
