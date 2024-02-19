package sortingObjects;

public class Employee {
	int id;
	String name;
	Double salary;
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return "Id:"+this.id+" Name: "+this.name+" Salary: "+this.salary;
	}

}
