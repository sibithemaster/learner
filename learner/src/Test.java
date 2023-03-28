
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int row=1;row<=4;row++)
//		{
//			for(int col=1;col<=row;col++) {
//				System.out.print(col+1);
//			}
//			System.out.println();
//		}
		
//		int a[] = new int[5];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		
//		System.out.println(a.length);
//		

		int a[][]= {{1,2},{3,4}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

}

//*
//**
//***

//1
//2 3
//4 5 6
//7 8 9 10