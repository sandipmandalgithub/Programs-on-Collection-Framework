package customsorting;
import java.util.*;


public class SortByStudentMarks implements Comparator<Student> {
	@Override
	public int compare(Student x,Student y)
	{
		return x.marks-y.marks;
	}

}
