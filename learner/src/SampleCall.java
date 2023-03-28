
public class SampleCall extends Sample{

	@Override
	public void add() {		
		int a=100,b=200;
		System.out.println(b+a);		
	}
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "mani";
	}
	//== .equals()
	public static void main(String[] args) {
		SampleCall s = new SampleCall();
		s.add();
		s.subtract();
	    System.out.println(s.name());
	}

	

	

}
