package com;
import java.util.ArrayList;
import java.util.LinkedList;
/*1)ll.addAll(al);-->[10,20,40]-->size is 3
 * All the Objects of 1 collection is added into another collection one by one(Squentially).
 * 
 *  2)ll.add(al)-->[[10,20],40]-->size is 2
 *  All the Objects of one collection is added into another collection as a single object.
 */
public class Runner1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		System.out.println();
		LinkedList ll=new LinkedList();
		ll.add(al);
		//ll.addAll(al);
		ll.add(40);
		System.out.println(ll);
		

		System.out.println("All Elements:"+al+" Size:"+al.size());
		System.out.println("All Elements:"+ll+" Size:"+ll.size());
	}

}
