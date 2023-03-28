package org.emp;

import org.company.Company;
import org.department.Department;
import org.salary.Salary;

public class Employee {
	
	public void empName()
	{
		System.out.println("Rajesh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e=new Employee();
        e.empName();
        
        Company c=new Company();
        c.companyName();
        
        Department d=new Department();
        d.departmentName();
        
        Salary s=new Salary();
        s.Salaramount();
	}

}
