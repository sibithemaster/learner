
public class MethodOverloading 
{
	public void details()
	{
		System.out.println("ID    NAME      PLACE");
		System.out.println("1001 RajKumar  Chennai");
	}
	public void details(int id)
	{
		System.out.println("ID: "+id);
	}
	public void details(String name ,long number)
	{
		System.out.println("Name: "+name);
		System.out.println("Phone: "+number);
	}
	public void details(int ids,String names ,long numbers) {
		System.out.println("ID: "+ids);
		System.out.println("Name: "+names);
		System.out.println("Phone: "+numbers);
	}
	
	public static void main(String[] args) 
	{
		MethodOverloading m = new MethodOverloading();
		m.details();
		m.details(1002);
		m.details("Kavitha", 9003147951l);
		m.details(1003, "Jhon", 8000080000l);
	}
}
