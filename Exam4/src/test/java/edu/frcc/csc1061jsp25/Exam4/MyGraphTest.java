package edu.frcc.csc1061jsp25.Exam4;

import java.util.ArrayList;
import java.util.List;

public class MyGraphTest {

	public static void main(String[] args) {
		List<Integer> vertices = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			vertices.add(i);
		}

		// Edges for MST
		Integer[][] edges = {
				{0, 1, 5}, {0, 2, 4}, 
				{1, 0, 5}, {1, 2, 2}, {1, 5, 3},
				{2, 0, 4}, {2, 1, 2}, {2, 5, 4}, {2, 3, 5},
				{3, 2, 5}, {3, 5, 6}, {3, 4, 7},
				{4, 3, 7}, {4, 5, 8},
				{5, 1, 3}, {5, 2, 4}, {5, 3, 6}, {5, 4, 8}
		};

		MyGraph<Integer> graph = new MyGraph<>(vertices, edges);
		System.out.println("Original Graph:");
		graph.printEdges();
		
		System.out.println("Minimum Spanning Tree:");
		graph.findMinimumSpanningTree().printEdges();		
	}


}
