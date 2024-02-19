package com;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		//INTERNALLY AN ARRAY GETS CREATED OF DEFAULT INITIAL CAPACITY(10)
		ArrayList a=new ArrayList();
		
		//INTERNALLY AN ARRAY GETS CREATED OF CUSTOM INITIAL CAPACITY(20)
		ArrayList b=new ArrayList(20);
		
		ArrayList x=new ArrayList();
		x.add(10);
		x.add(20);
		ArrayList y=new ArrayList(x);
		y.add(30);
		
		System.out.println(x);
		System.out.println(y);
	}

}
