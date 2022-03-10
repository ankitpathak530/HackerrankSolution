package com.ds.Ankit_Pathak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Find_Running_Median_HackerRank {

	public static List<Double> runningMedian(List<Integer> a) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		List<Double> result = new ArrayList();

		double median = 0.0;
		int cur;
		for (int i = 0; i < a.size(); i++) {
			cur = a.get(i);

			if (cur > median)
				minHeap.offer(cur);
			else
				maxHeap.offer(cur);

			if (maxHeap.size() - minHeap.size() > 1) {
				minHeap.offer(maxHeap.poll());
			} else if (minHeap.size() - maxHeap.size() > 1) {
				maxHeap.offer(minHeap.poll());
			}

			if (minHeap.size() == maxHeap.size()) {
				median = (minHeap.peek() + maxHeap.peek()) / 2.0;
				result.add(median);
			} else if (minHeap.size() > maxHeap.size()) {
				median = (double) minHeap.peek();
				result.add(median);
			} else {
				median = (double) maxHeap.peek();
				result.add(median);
			}
		}

		return result;
	}
}
