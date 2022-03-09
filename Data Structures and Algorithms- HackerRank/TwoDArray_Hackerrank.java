package com.ds.Ankit_Pathak;

import java.util.List;

public class TwoDArray_Hackerrank {

	
	
	public static int hourglassSum(List<List<Integer>> arr) {
		// Write your code here
		int sum, max = Integer.MIN_VALUE;

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1)
						+ arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
				if (sum > max)
					max = sum;
			}
		}
		return max;
	}



}
