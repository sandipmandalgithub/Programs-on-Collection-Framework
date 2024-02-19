package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(50);
		al.add(20);
		al.add(10);
		al.add(40);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		System.out.println("-----------");
		
		LinkedList ll=new LinkedList();
				
		ll.add(10);
		ll.add(20.0);
		ll.add("java");
		ll.add(true);
		System.out.println(ll);
		//Collections.sort(ll);//ClassCastException
//		Collections.reverse(ll);
//		System.out.println(ll);
//		
		System.out.println("Before reversing..");
		for(Object obj:ll) {
			System.out.println(obj);
		}
		Collections.reverse(ll);
		System.out.println("-----------");
		System.out.println("After reversing...");
		for(Object obj:ll)
		{
			System.out.println(obj);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
