package org.employeedetails;

public class  Employee{
   public void empId() 
   {
	   System.out.println(2);
   }
   public void  empName()
   {
	   System.out.println("NandhaKumar");
   }
   public void  empDob()
   {
	   System.out.println("17/01/1997");
   }
   public void empPhone()
   {
	   System.out.println(8989898989l);
   }
   public void  empEmail() {
	   System.out.println("nandha@gmail.com");
   }
   public void empAddress() {
	   System.out.println("NO.2 Gandhi nagar, Velacherry");
   }

   public static void main(String[] args) {
      Employee e = new Employee();
      e.empId();
      e.empName();
      e.empEmail();
      e.empPhone();
      e.empDob();
      e.empAddress();
      
      
   }
}
