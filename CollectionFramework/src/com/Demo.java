package com;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20.0);
		l.add(10);
		l.add(true);
		l.add(null);
		l.add("Java");
		System.out.println(l.size());
		System.out.println(l);
		System.out.println("-------------");
		System.out.println(l.contains(10));
		System.out.println(l.contains("java"));
		System.out.println(l.indexOf(20));
		System.out.println("-------------");
		System.out.println(l.isEmpty());
		l.remove(1);
		System.out.println(l);
		//l.clear();
		System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
		System.out.print("------------");
		for(int i=l.size()-1;i>=0;i--)
		{
			System.out.print(l.get(i)+" ");
		}
		
		
	}

	
}
