package com.ds.Ankit_Pathak;

import java.util.ArrayList;
import java.util.List;

public class Components_In_Graph_Hackerrank {

	static class UnionFind {
		private int[] parent;
		int[] rank;
		private int tv;

		UnionFind() {
			this.tv = 50000;
			parent = new int[tv];
			rank = new int[tv];

			for (int i = 0; i < tv; i++) {
				parent[i] = i;
				rank[i] = 1;
			}
		}

		int find(int x) {
			if (parent[x] == x)
				return x;

			int temp = find(parent[x]);
			// path compression
			parent[x] = temp;
			return temp;
		}

		void union(int x, int y) {
			int px = find(x);
			int py = find(y);

			if (px != py) {
				if (rank[px] > rank[py]) {
					parent[py] = px;
					rank[px] += rank[py];
					rank[py] = 1;
				} else if (rank[px] < rank[py]) {
					parent[px] = py;
					rank[py] += rank[px];
					rank[px] = 1;
				} else {
					parent[py] = px;
					rank[px] += rank[py];
					rank[py] = 1;
				}
			}
		}

		boolean isConnected(int x, int y) {
			return find(x) == find(y);
		}

		int getComponents(int p) {
			return rank[p];
		}

	}

	public static List<Integer> componentsInGraph(List<List<Integer>> gb) {
		List<Integer> ans = new ArrayList<>();

		UnionFind uf = new UnionFind();
		int biggestRank = 0;
		int smallestRank = Integer.MAX_VALUE;
		int ver = 0;

		for (int i = 0; i < gb.size(); i++) {
			List<Integer> edge = gb.get(i);
			int u = edge.get(0);
			int v = edge.get(1);
			uf.union(u, v);

			ver = Math.max(ver, Math.max(u, v));
		}

		for (int i = 1; i <= ver; i++) {
			// System.out.print(uf.rank[i]+" ");
			if (uf.rank[i] > 1)
				smallestRank = Math.min(uf.rank[i], smallestRank);

			biggestRank = Math.max(biggestRank, uf.rank[i]);
		}

		ans.add(smallestRank);
		ans.add(biggestRank);

		return ans;

	}

}
