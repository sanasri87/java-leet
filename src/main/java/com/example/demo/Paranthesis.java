package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Paranthesis {

	
	public static void main(String[] args) {
		getParanthesis(2);
	}
	
	public static List<String> getParanthesis(int n) {
		
		List<String> list = new ArrayList<>();
		
		int left = n;
		int right = n;
		makeParanthesis(list,n,left,right,"");
		for(String s : list) {
			System.out.println(s);
		}
		
		return list;
		
		
	}

	private static void makeParanthesis(List<String> list, int n, int left, int right,  String s) {
		
		if(left>right)
			return;
		if(right==0 && left==0)
			list.add(s);
		
		if(left>0)
			makeParanthesis(list, n, left-1, right, s+"(");
		if(right>0)
			makeParanthesis(list, n, left, right-1, s+")");
		
	}
}
