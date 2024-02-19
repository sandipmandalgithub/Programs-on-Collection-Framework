package org;

import java.util.LinkedList;

public class EmployeeSolution {
	public static void main(String[] args) {
		Employee e1=new Employee("Dhoni",5.0);
		Employee e2=new Employee("Jadeja",4.8);
		
		LinkedList<Employee> ll=new LinkedList<Employee>();
		ll.add(e1);
		ll.add(e2);
		//ll.add(new Employee("Raina",4.9));
		//USING FOR-EACH LOOP
		for(Employee e:ll)
		{
			System.out.println(e);
		}
	}

}
