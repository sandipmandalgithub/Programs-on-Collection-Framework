package sortingObjects;
/*DEVELOP A JAVA PROGRAM OF STUDENT OF NAME AND MARKS-->1)PRINT THE HIGHEST MARKS
2)PRINT THE LOWEST MARKS
3)PRINT THE STUDENT NAME WHOSE MARKS INT BETWEEN 60 TO 80*/

public class Student implements Comparable<Student>{
	String name;
	int marks;
	
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString()
	{
		return "Name:"+this.name+" Marks:"+this.marks;
	}
	@Override
	public int compareTo(Student s)
	{
		return this.marks-s.marks;
	}
	

}
