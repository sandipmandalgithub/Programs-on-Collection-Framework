package com;

public class Practice {
	public static void main(String[] args) {
		String str="racecar";
		String lp=findLP(str);
		System.out.println("Longest palindromic string is\n "+lp);
	}

	private static String findLP(String str) {
		int start=0;
		int end=0;
		for(int i=0;i<str.length();i++)
		{
			int len1=findMid(str,i,i+1);
			int len2=findMid(str,i,i);
			int len=len2-len1;
			if(end-start<len) {
				start=i-(len-1)/2;
				end=i+len/2;
			}
		}
		return str.substring(start,end+1);
	}

	private static int findMid(String str, int i, int j) {
		while(i>=0&&j<str.length()&&str.charAt(i)==str.charAt(j))
		{
			i--;
			j++;
		}
		return j-i-1;
	}

}
