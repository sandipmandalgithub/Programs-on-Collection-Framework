package mapExamples;
import java.util.LinkedHashMap;
import java.util.Set;
//TRAVERSING LINKEDHASHMAP USING FOR EACH LOOP
//STEP TO TRAVERSE FROM MAP
// 1)CONVERT THE MAP INTO A SET OF KEYS USING KEYSET()METHOD.
// 2)TRAVERSE THE KEY USING FOR EACH LOOP AND GET THE VALUE USING GET()METHOD.
public class Solution {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(101, "Java");
		map.put(102,"Python");
		map.put(103, "C");

		Set<Integer>keys=map.keySet();

		for(int key:keys)//101 102 103
		{
			System.out.println(key+"--->"+map.get(key));
		}
	}

}