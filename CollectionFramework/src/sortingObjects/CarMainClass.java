package sortingObjects;
import java.util.ArrayList;
import java.util.Collections;
/**1)sort()method also uses compareTo()method internally for sorting objects.
 * 2)If there are car objects inside list,sort()method goes in search of compareTo()methos in car class.
 * 3)Therefore the car objects should be Comparable in nature.
 * 4)sort()method can sort only list(ArrayList,LinkedList,Vector&Stack).
 */
public class CarMainClass {
	public static void main(String[] args) {
		Car c1=new Car(500);
		Car c2=new Car(200);
		Car c3=new Car(300);
		
		ArrayList<Car> al=new ArrayList<Car>();
		al.add(c1);//al.add(new Car(100));
		al.add(c2);//al.add(new Car(200));
		al.add(c3);//al.add(new Car(300));
		
		//BEFORE SORTING
		System.out.println(al);
		
		//AFTER SORTING
		Collections.sort(al);
		System.out.println(al);
		
		for(Car c:al)//c1 c2 c3
		{
			System.out.println(c);
		}
	}

}
