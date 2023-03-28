
public class CallingBank {

	public static void main(String[] args) 
	{
	  SBI s = new SBI();
	  System.out.println(s.interestRate());
	  ICICI i = new ICICI();
	  System.out.println(i.interestRate());
	  HDFC h = new HDFC();
	  System.out.println(h.interestRate());
	}

}
