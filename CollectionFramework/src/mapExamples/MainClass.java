package mapExamples;
import java.util.LinkedHashMap;
import java.util.Set;
//TREAVERSING MAP USING FOR EACH LOOP
public class MainClass {
	public static void main(String[] args) {
		LinkedHashMap<String,Double>map=new LinkedHashMap<String,Double>();
		map.put("DHONI",5.0);
		map.put("JADEJA", 4.7);
		
		Set<String>keys=map.keySet();//"DHONI","JADEJA"
		for(String key:keys)
		{
			System.out.println("SALARY OF "+key+" is "+map.get(key)+" LPA");
		}
		
	}

}
