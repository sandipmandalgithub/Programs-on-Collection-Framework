package mapExamples;
import java.util.LinkedHashMap;
import java.util.Set;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1=new Student(22,"Tom");
		Student s2=new Student(25,"Alex");
		Student s3=new Student(28,"James");
		
		LinkedHashMap<Student,Double> map=new LinkedHashMap<Student,Double>();
		map.put(s1,5.6);//map.put(new Student(22,"Tom"),5.6);
		map.put(s2,5.7);//map.put(new Student(25,"Alex"),5.7);
		map.put(s3, 5.98);//map.put(new Student(28,"James"),5.98);
		
		Set<Student>keys=map.keySet();//s1 s2 s3
		for(Student key:keys)
		{
			System.out.println(key+" Height: "+map.get(key));
		}
	}

}
