package sortingObjects;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1=new Student("Dhoni",50);
		Student s2=new Student("Jadeja",30);
		Student s3=new Student("Raina",80);
		Student s4=new Student("Virat",40);
		Student s5=new Student("Rohit",70);
		
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		//BEFORE SORTING
		System.out.println(al);
		//AFTER SORTING
		Collections.sort(al);
		System.out.println(al);
		//PRINT NAME ALONG WITH LOWEST MARKS
		System.out.println("Lowest marks "+al.get(0));
		//PRINT NAME ALONG WITH HIGHEST MARKS
		System.out.println("Highest marks "+al.get(al.size()-1));
		//PRINT NAME WHOSE NUMBER BETWEEN 61 TO 80
		System.out.println("Student marks between 60 to 80");
		for(Student s:al)
		{
			if(s.marks>=61&&s.marks<=80)
				System.out.println(s);	
		}
	}

}
