import java.util.Scanner;

public class WithOutArgumentAndWithOutRetutnType 
{
	public static void additionOfTwoNumbers()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a");
		int a=sc.nextInt();
		System.out.println("Enter value for b");
		int b=sc.nextInt();
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		WithOutArgumentAndWithOutRetutnType.additionOfTwoNumbers();
	}
}
