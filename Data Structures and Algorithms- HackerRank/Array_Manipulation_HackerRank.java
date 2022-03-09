package com.ds.Ankit_Pathak;

import java.util.List;

public class Array_Manipulation_HackerRank {

	public static long arrayManipulation(int n, List<List<Integer>> queries) {

		long[] ar = new long[n + 1];

		for (int i = 0; i < queries.size(); i++) {
			int a = queries.get(i).get(0);
			int b = queries.get(i).get(1);
			int k = queries.get(i).get(2);

			ar[a - 1] += k;
			ar[b] -= k;
		}

		/* Find max */
		long sum = 0;
		long max = 0;
		for (int i = 0; i < n; i++) {
			sum += ar[i];
			max = Math.max(max, sum);
		}
		return max;
	}
}
