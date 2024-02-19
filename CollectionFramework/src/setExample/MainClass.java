package setExample;

import java.util.TreeSet;

public class MainClass {
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("Dhoni");
		t.add("Jadeja");
		t.add("Raina");
		
		for(String s:t)
		{
			System.out.println(s);
		}
	}

}
