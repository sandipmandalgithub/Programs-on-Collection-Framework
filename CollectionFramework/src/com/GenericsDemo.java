package com;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsDemo {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Dhoni");
		al.add("Virat");
		al.add("Jadeja");
		System.out.println(al);
		for(String str:al)
		{
			System.out.println(str+" ");
		}
		
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println("----------");
		System.out.println(ll);
		for(Integer i:ll)//for(int i:ll)
		{
			System.out.println(i+" ");
		}
		System.out.println("-------------");
		ArrayList a=new ArrayList();
		a.add(10);//a.add(new Integer(10));
		a.add(20.0);//a.add(new Double(20.0));
		a.add(true);//a.add(new Boolean(true));
		a.add("Java");//a.add(new String("Java"));
		for(Object obj:a)//Upcasting or Generalization
		{
			System.out.println(obj);
		}
	}

}
