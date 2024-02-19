package defaultSorting;

import java.util.TreeSet;

public class SortEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Dhoni");
		Employee e2=new Employee(102,"Raina");
		Employee e3=new Employee(103,"Jadeja");
		
		TreeSet<Employee> t=new TreeSet<Employee>();
		t.add(e1);//t.add(new Employee(101,"Dhoni"));
		t.add(e2);//t.add(new Employee(102,"Raina"));
		t.add(e3);//t.add(new Employee(103,"Jadeja"));

		
		for(Employee obj:t)
		{
			System.out.println(obj);
		}
	}

}
