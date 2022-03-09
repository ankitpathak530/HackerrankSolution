package com.ds.Ankit_Pathak;

import java.util.List;

public class Between_Two_Sets_Hackerrank {

	public static int getTotalX(List<Integer> a, List<Integer> b) 
	{
		int count = 0;
		int ax = 1;

		for (int i = 0; i < a.size(); i++)
			ax = lcm(ax, a.get(i));

		int bx = b.get(0);
		for (int i = 1; i < b.size(); i++)
			bx = gcd(bx, b.get(i));
		
		if (ax > bx)
			return 0;

		for (int i = ax, j = 2; i <= bx; i = ax * j, j++)
			if (bx % i == 0)
				count++;

		return count;
	}

	public static int lcm(int x, int y) {
		return (x * y) / gcd(x, y);
	}

	public static int gcd(int x, int y) {
		if (y != 0)
			return gcd(y, x % y);
		else
			return x;
	}
}
