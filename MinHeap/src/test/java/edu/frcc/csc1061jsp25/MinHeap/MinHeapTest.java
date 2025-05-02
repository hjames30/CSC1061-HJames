package edu.frcc.csc1061jsp25.MinHeap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinHeapTest {

	public static void main(String[] args) {
		int[] nodes = {88,85,83,72,73,42,57,6,48,60};
		Minheap<Integer> minHeap = new Minheap<>();
		
		for(int node: nodes) {
			minHeap.add(node);
		}
		System.out.println("MinHeap Removal ");
		while(!minHeap.isEmpty()) {
			System.out.print(minHeap.remove()+" ");
		}
		System.out.println();
		
		PriorityQueue<Integer> qheap = new PriorityQueue<>();
		for(int node : nodes) {
			qheap.add(node);
		}
		System.out.println("PQHeap Removal:");
		while(!qheap.isEmpty()) {
			System.out.print(qheap.remove()+" ");
		}
		System.out.println();
		//Collections.reverseOrder changes the way it is compared, changing the order it's in 
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		for(int node : nodes) {
			maxHeap.add(node);
		}
		System.out.println("MPQHeap Removal:");
		while(!maxHeap.isEmpty()) {
			System.out.print(maxHeap.remove()+" ");
		}
		System.out.println();
	}

}
