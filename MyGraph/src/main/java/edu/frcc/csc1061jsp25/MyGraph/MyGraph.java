package edu.frcc.csc1061jsp25.MyGraph;

import java.util.ArrayList;
import java.util.List;

public class MyGraph<E> {
	private List<Vertex> vertices = new ArrayList<>();

	private class Vertex {
		private E element;
		private List<Edge> neighbors = new ArrayList<>();

		public Vertex(E element) {
			this.element = element;
		}

		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}

		public List<Edge> getNeighbors() {
			return neighbors;
		}

		public void setNeighbors(List<Edge> neighbors) {
			this.neighbors = neighbors;
		}
		

		public String toString() {
			return element.toString();
		}

	}

	private class Edge {
		private Vertex source;
		private Vertex destination;
		private int weight;

		public Edge(Vertex source, Vertex destination, int weight) {
			super();
			this.source = source;
			this.destination = destination;
			this.weight = weight;
		}

		public Vertex getSource() {
			return source;
		}

		public void setSource(Vertex source) {
			this.source = source;
		}

		public Vertex getDestination() {
			return destination;
		}

		public void setDestination(Vertex destination) {
			this.destination = destination;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		@Override
		public String toString() {
			return "Edge:Source " + source + " Destination: " + destination + " Weight: " + weight;
		}

	}

	public MyGraph(List<Vertex> vertices) {
		for(Vertex v : vertices) {
			this.vertices.add(v);
		}
	}

	public MyGraph(List<E> elements, E[][] edges) {
		for(E e:elements) {
			this.vertices.add(new Vertex(e));
		}
		createAdjecntcyList(edges);
	}

	private void createAdjecntcyList(E[][] edges) {
		for(int i=0;i<edges.length;i++) {
			Vertex source = findVertex(edges[i][0]);
			Vertex destination = findVertex(edges[i][1]);
			addEdge(new Edge(source,destination,(int)edges[i][2]));
		}
		
	}

	private Vertex findVertex(E key) {
		for(Vertex v :vertices) {
			if(v.element.equals(key)) {
				return v;
			}
		}
		return null;
	}
	private boolean addEdge(Edge edge) {
		List<Edge> neighbors = edge.source.neighbors;
		if(!neighbors.contains(edge)) {
			neighbors.add(edge);
			return true;
		}
			return false;
		
	}
	public void printEdges() {
		for(int i =0;i<vertices.size();i++) {
			Vertex ver = vertices.get(i);
			System.out.println("Vertex: "+ver+":");
			List<Edge> neighbors = ver.neighbors;
			for(Edge edge: neighbors) {
				System.out.println("("+ edge.source+", "+edge.destination+", "+edge.weight+")");
			}
			System.out.println();
		}
	}

}
