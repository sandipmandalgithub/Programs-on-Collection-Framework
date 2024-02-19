package defaultSorting;

public class Student implements Comparable<Student> {
	int age;
	
	Student(int age)
	{
		this.age=age;
	}
	@Override
	public String toString()
	{
		return "Age: "+this.age;
	}
	@Override
	public int compareTo(Student s)
	{
		return this.age-s.age;//FOR ASCENDING ORDER
		//return s.age-this.age;//FOR DESENDING ORDER
		//this-->CURRENT OBJECT TO BE INSERTED
		//s-->ALREADY EXISTING OBJECT
	}

}
