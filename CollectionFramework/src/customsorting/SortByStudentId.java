package customsorting;
import java.util.*;

public class SortByStudentId implements Comparator<Student> {
	@Override
	public int compare(Student x,Student y)
	{
		return x.id-y.id;
		
	}
	//x-->current object to be inserted
	//y-->already existing object

}
