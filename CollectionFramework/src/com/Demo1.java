package com;

import java.util.Vector;

public class Demo1 {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println(v);//[10,20,30]
		v.add(1,40);
		System.out.println(v);//[10,40,20,30]
		v.set(2, 50);
		System.out.println(v);//[10,40,50,30]
	}

}
