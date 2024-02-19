package customsorting;

import java.util.Comparator;

public class SortEmployeeBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee x,Employee y)
	{
		return ((Double) x.salary).compareTo(y.salary);
//		Double d=x.salary;
//		Double c=y.salary;
//		return d.compareTo(c);
	}

}
