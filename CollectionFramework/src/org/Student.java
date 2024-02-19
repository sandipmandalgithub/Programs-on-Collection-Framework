package org;
//DEVELOP A JAVA PROGRAM TO STORE STUDENTS OBJECTS INSIDE ARRAYLIST & TRAVERSE
//THE OBJECTS USING FOR AND FOR-EACH LOOP --ATTRIBUTES ARE NAME & MARKS--TRAVERSING AFTER OVERRIDING
//toString() USING FOR EACH LOOP AND FOR LOOP.
public class Student {
	String name;
	int marks;
	
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return this.name+" has Scored "+this.marks+" marks";
	}

}
