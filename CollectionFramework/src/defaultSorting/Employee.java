package defaultSorting;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString()
	{
		return "Emp ID of "+this.name+" is "+this.id;
	}
	@Override
	public int compareTo(Employee e)
	{
		return this.id-e.id;//SORTING BASED ON ID
		//return this.name.compareTo(e.name);//SORTING BASED ON NAME
	}
	/**
	THIS-->CURRENT OBJECT TO BE INSERTED

	E-->ALREADY EXISTING OBJECT


    SORTING BASED ON ID:
	1)-->ASENDING ORDER:RETURN THIS.ID-E.ID;
	2)-->DESENDING ORDER:RETURN E.ID-THIS.ID;

	SORTING BASED ON NAME:
	1)-->ASENDING ORDER:RETURN THIS.NAME.COMPARETO(E.NAME);
	2)-->DESENDING ORDER:RETURN E.NAME.COMPARETO(THIS.ID);

	 ** SORTING OF OBJECTS CAN HAPPEN ONLY 1 ATTRIBUTES (VARIABLE) AT A TIME.
	    THEREFORE IN THE ABOVE PROGRAM WE CAN DEFINE THE SORITNG LOGIC FOR
	    EITHER ID OR NAME AT A TIME AND NOT BOTH.
	 ** FOR STRING COMPARISION OR STRING SORTING ,WE CANNOT USE(-),
	    WE HAVE TO USE COMPARETO()STRING CLASS.
	 
	 */












}
