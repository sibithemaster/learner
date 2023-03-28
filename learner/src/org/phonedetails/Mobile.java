package  org.phonedetails; 

public class Mobile {

	public void brandname()
	{
		System.out.println("Redmi");
	} 
	public void processorname() {
		System.out.println("Snapdragon");
	}
	public void ram() {
		System.out.println("4gb ram");
	}public void mobcolor() {
		System.out.println("Sky Blue");
	}
	
	 public static void main(String[] args) {
		 Mobile mobile = new Mobile();
		 mobile.brandname();
		 mobile.processorname();
		 mobile.ram();
		 mobile.mobcolor();
	 }
}
