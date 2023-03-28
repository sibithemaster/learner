package com.days.conditional;

public class BigAmongFour {

	public static void main(String[] args)
	{
		
		int a=10,b=20,c=25,d=15;
		
		//true&&true&&true
		if(a>b && a>c && a>d)
		{
			System.out.println("A is big");
		}else if(b>a && b>c && b>d) {
			System.out.println("B is big");
		}else if(c>a && c>b && c>d) {
			System.out.println("C is big");
		}else {
			System.out.println("D is big");
		}
		
		
	}

}
//break and continue cannot be used outside the loop
/*int i=5;
if (i == 5) 
{
 break;
}
System.out.print(i);

if (i == 5) 
{
 continue;
}
System.out.print(i);
*/