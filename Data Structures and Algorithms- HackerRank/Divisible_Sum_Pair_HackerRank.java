package com.ds.Ankit_Pathak;

import java.util.List;

public class Divisible_Sum_Pair_HackerRank {

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		// Write your code here
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = ar.get(i) + ar.get(j);
				if (sum % k == 0)
					count++;
			}
		}
		return count;
	}
}
