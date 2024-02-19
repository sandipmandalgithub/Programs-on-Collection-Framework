package org;

import java.util.ArrayList;

public class StudentSolution {
	public static void main(String[] args) {
		Student s1=new Student("Dhoni",100);
		Student s2=new Student("Jadeja",99);
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		//USING NORMAL FOR LOOP
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("-------------");
		//USING FOR-EACH LOOP
		for(Student s:al)
		{
			System.out.println(s);
		}
	}

}
