package com;

import java.util.Vector;

public class Solution {
	public static void main(String[] args) {
		Vector v =new Vector();
		v.add(10);
		v.add(10.5);
		v.add(true);
		v.add("Java");
		v.add(10.15f);
		System.out.println(v);
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		for(int i=v.size()-1;i>=0;i--)
		{
			System.out.print(v.get(i)+" ");
		}
		
	}

}
