package mapExamples;
import java.util.HashMap;
//IMPORTANT METHODS PRESENT IN <<MAP>> INTERFACE
public class Demo {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(10, "java");
		map.put("Apti",34.5);
		map.put(1.2, 555);
		System.out.println(map);//{1.2=555, 10=java, Apti=34.5}
		System.out.println(map.size());//3
		System.out.println(map.get(10));//java
		System.out.println(map.get(555));//null
		System.out.println("--------------");
		System.out.println(map.containsKey("Apti"));//true
		System.out.println(map.containsValue(555));//true
		System.out.println("----------------");
		System.out.println(map.isEmpty());//false
		map.clear();
		System.out.println(map.isEmpty());//true

	}

}
