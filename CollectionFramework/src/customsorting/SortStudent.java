package customsorting;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		Student s1=new Student(120,45);
		Student s2=new Student(111,50);
		Student s3=new Student(132,60);
		
		SortByStudentId id=new SortByStudentId();
		SortByStudentMarks marks=new SortByStudentMarks();
		
		TreeSet<Student>t=new TreeSet<Student>(id);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Student s:t)
		{
			System.out.println(s);
		}
	}

}
