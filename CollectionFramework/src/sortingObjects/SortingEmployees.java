package sortingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingEmployees {
	public static void main(String[] args) {
		//SortEmployeeById id=new SortEmployeeById();
		//SortEmployeeByName name=new SortEmployeeByName();
		SortEmployeeBySalary sal=new SortEmployeeBySalary();
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(105,"DHONI",4.9));
		list.add(new Employee(102,"RAINA",4.8));
		list.add(new Employee(109,"JADEJA",4.7));
		
		//Collections.sort(list,id );
		//Collections.sort(list, name);
		Collections.sort(list,sal);
		
		//TRAVERSING USING ITERATOR()METHOD
		Iterator<Employee>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------------------");
		//TRAVERSING USING FOR-EACH LOOP
		for(Employee s:list)
		{
			System.out.println(s);
		}
		System.out.println("-----------------------");
		//TRAVERSING USING NORMAL FOR LOOP
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
