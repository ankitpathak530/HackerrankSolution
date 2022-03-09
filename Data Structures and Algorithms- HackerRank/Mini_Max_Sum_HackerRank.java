package com.ds.Ankit_Pathak;

import java.util.List;

public class Mini_Max_Sum_HackerRank {

	public static void miniMaxSum(List<Integer> arr) {
		// Write your code here
		long sum = arr.get(0);
		long min = sum;
		long max = sum;

		for (int i = 1; i < arr.size(); i++) {
			sum += arr.get(i);
			if (arr.get(i) < min)
				min = arr.get(i);
			if (arr.get(i) > max)
				max = arr.get(i);
		}
		System.out.print((sum - max) + " " + (sum - min));
	}
}
