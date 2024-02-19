package customsorting;

import java.util.TreeSet;

public class SortEmployee {
public static void main(String[] args) {
		
		SortEmployeeById id=new SortEmployeeById();
		SortEmployeeBySalary salary=new SortEmployeeBySalary();
		SortEmployeeByName name= new SortEmployeeByName();
		
		//TreeSet<Employee> t=new TreeSet<Employee>(name);
		//TreeSet<Employee> t=new TreeSet<Employee>(id);
	    TreeSet<Employee> t=new TreeSet<Employee>(salary);
				t.add(new Employee(101,"Tom",700.67));
				t.add(new Employee(200,"Jack",900.7));
				t.add(new Employee(302,"Jerry",500.6));
				for(Employee e:t)
				{
					System.out.println(e);
				}
		
	}

}



