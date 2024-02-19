package com;

import java.util.ArrayList;
import java.util.LinkedList;

public class Runner {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);//[10,20,30]
		LinkedList ll=new LinkedList();
		ll.addAll(al);
		ll.add(40);
		System.out.println(ll);//[10,20,30,40]
		System.out.println(ll.containsAll(al));//TRUE
		ll.removeAll(al);
		System.out.println(ll);//40
	}

}
