package com.Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		//TRAVERSING USING NORMAL FOR LOOP
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("********************");
		//TRAVERSING USING FOR-EACH OR ENHANCED FOR LOOP
		for(int in:al)
		{
			System.out.println(in);
		}
		System.out.println("**********************");
		//TRAVERSING USING ITERATORS
		Iterator<Integer>itr=al.iterator();//GENERATES ADDRESS
		while(itr.hasNext())//CHECK THE OBJECTS IS THERE OR NOT
		{
			System.out.println(itr.next());//RETURNS THE OJECTS
		}
	}

}
