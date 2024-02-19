package defaultSorting;

import java.util.TreeSet;

public class SortHotel {
	public static void main(String[] args) {
		Hotel h1=new Hotel("abc",4.5);
		Hotel h2=new Hotel("pqr",7.5);
		Hotel h3=new Hotel("xyz",9.5);
		Hotel h4=new Hotel("stu",6.5);
		Hotel h5=new Hotel("ijk",8.5);
		
		TreeSet<Hotel>t=new TreeSet<Hotel>();
		t.add(h1);
		t.add(h2);
		t.add(h3);
		t.add(h4);
		t.add(h5);
		
		for(Hotel obj:t)
		{
			System.out.println(obj);
		}
		//PRINT THE NAME OF THE HOTEL WITH HIGHEST RATINGS & LOWEST RATINGS
		
	}

}
