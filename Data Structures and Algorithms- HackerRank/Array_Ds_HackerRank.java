package com.ds.Ankit_Pathak;

import java.util.ArrayList;
import java.util.List;

public class Array_Ds_HackerRank {

	
	public static List<Integer> reverseArray(List<Integer> a) {
		// Write your code here
		List<Integer> list = new ArrayList<Integer>();

		for (int i = a.size() - 1; i >= 0; i--)
			list.add(a.get(i));
		return list;
	}
}
