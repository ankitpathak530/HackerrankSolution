package com.ds.Ankit_Pathak;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation_HackerRank {

	/*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */
	public static List<Integer> rotateLeft(int d, List<Integer> arr)
	{
	
		List<Integer> result = new ArrayList<>();
		int n = arr.size();

		if (d > n)
			d = d % n;

		int k = d;
		do {
			if (k == n)
				k = 0;
			result.add(arr.get(k++));
			
		} while (k != d);

		return result;
	}


	
	
	 
	public static void main(String[] args) {
        // Call rotateLeft() method by passing input array and step of rotation
	}

	
}
