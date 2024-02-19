package customsorting;

public class Student {
	int id;
	int marks;
	Student(int id,int marks)
	{
		this.id=id;
		this.marks=marks;
		
	}
	@Override
	public String toString()
	{
		return "ID:"+ id+" Marks:"+ marks;
	}

}
