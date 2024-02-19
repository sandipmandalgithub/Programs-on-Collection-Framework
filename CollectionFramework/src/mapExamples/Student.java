package mapExamples;

public class Student {
	
	int age;
	String name;
	Student(int age,String name)
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString()
	{
	return "Age: "+this.age+" Name: "+this.name;	
	}

}
