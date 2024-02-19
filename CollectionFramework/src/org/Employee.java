package org;
//DEVELOP A JAVA PROGRAM TO STORE EMPLOYEE OBJECTS INSIDE LINKEDLIST & TRAVERSE
// THE OBJECTS USING FOR-EACH LOOP --ATTRIBUTES ARE NAME & SALARY--TRAVERSING AFTER OVERRIDING
//toString() USING FOR EACH LOOP

public class Employee {
	String name;
	double salary;
	
	
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString()
	{
		return this.name+" salary is "+this.salary+"LPA";
		
	}

}
