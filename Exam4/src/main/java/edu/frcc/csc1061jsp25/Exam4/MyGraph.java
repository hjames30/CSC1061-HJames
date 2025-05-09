package edu.frcc.csc1061jsp25.Exam4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

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
		@Override
		public boolean equals(Object other) {
			if (!(other instanceof MyGraph.Vertex))
				return false;
			
			if (element.equals(((Vertex)other).element)) {
				return true;
			}
			return false;		
		}
		

		public String toString() {
			return element.toString();
		}

	}

	private class Edge implements Comparable<Edge>{
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
		public boolean equals(Object edge) {
			return source.equals(((Edge) edge).source) && destination.equals(((Edge) edge).destination);
		}

		@Override
		public int compareTo(MyGraph<E>.Edge o) {
			return (int) (weight - o.weight);
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
	public boolean addVertex(Vertex vertex) {
		if (!vertices.contains(vertex)) {
			vertices.add(vertex);
			return true;
		} else {
			return false;
		}

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
	public List<Vertex> getChildNodes(Vertex vertex) {
		List<Vertex> childNodes = new ArrayList<>();
		List<Edge> neighbors = vertex.neighbors;
		for (Edge edge : neighbors) {
			childNodes.add(edge.destination);
		}
		return childNodes;
	}
	/* TODO: Implement the DFS algorithm for a graph either recursively
	** or iteratively using a stack. It should return a list of all the 
	** vertices in the pre-order depth-first traversal.
	*/
	public List<Vertex> dfs(Vertex root) {
		List<Vertex> visted = new ArrayList<>();
		ArrayDeque<Vertex> stack = new ArrayDeque<Vertex>();
		stack.push(root);
		visted.add(root);
		while(!stack.isEmpty()) {
			Vertex current = stack.pop();
			List<Vertex> children = getChildNodes(current);
			//Need to iterate from end to start LIFO for stack
			for(int i =children.size()-1;i>=0;i--) {
				Vertex child = children.get(i);
				if(!visted.contains(child)) {
					visted.add(child);
					stack.push(child);
				}
			}
		}
		return visted;
		
	}


	/* TODO: Implement the BFS algorithm for a graph. It should return a list 
	** of all the vertices in the breadth-first traversal.
	*/
	public List<E> bfs() {
		List<Vertex>visted = new ArrayList<>();
		List<E> vistedVert = new ArrayList<>();
		Queue<Vertex> queue = new ArrayDeque<Vertex>();
		for(Vertex root : vertices) {
			if(!visted.contains(root)) {
				visted.add(root);
				vistedVert.add(root.getElement());
				queue.add(root);
				
				while(!queue.isEmpty()) {
					Vertex current = queue.poll();
					List<Vertex> children = getChildNodes(current);
					
					for(Vertex child : children) {
						if(!visted.contains(child)) {
							visted.add(child);
							vistedVert.add(child.getElement());
							queue.add(child);
						}
					}
				}
				
			}
		}
		return vistedVert;
	}
	

	/* TODO: Create a spanning tree using Kruskal's Algorithm and return it.
     ** The spanning tree will be a new graph
     */
	public MyGraph<E> findMinimumSpanningTree() {
	    //Sort all edges by weight
	    List<Edge> allEdges = new ArrayList<>();
	    for (Vertex vertex : vertices) {
	        for (Edge edge : vertex.neighbors) {
	            //add edge only once, no pair
	            if (vertex.getElement().hashCode() < edge.getDestination().getElement().hashCode()) {
	                allEdges.add(edge);
	            }
	        }
	    }
	    Collections.sort(allEdges);

	    // new empty MST graph has vertices no edges
	    MyGraph<E> mst = new MyGraph<>(new ArrayList<>());
	    for (Vertex vertex : vertices) {
	        mst.addVertex(new Vertex(vertex.getElement()));
	    }

	    //Add edges if no cycle is formed, checks if path found already in vertices using dfs
	    for (Edge edge : allEdges) {
	        Vertex src = mst.findVertex(edge.getSource().getElement());
	        Vertex dest = mst.findVertex(edge.getDestination().getElement());
	        	//if no path add edge
	        if (!hasPathDFS(mst, src, dest, null)) {
	            mst.addEdge(mst.new Edge(src, dest, edge.getWeight()));
	            mst.addEdge(mst.new Edge(dest, src, edge.getWeight())); 
	        }
	    }

	    return mst;
	}

	// Check if there's already a path between src and dest, parrent used to not go backwards
	private boolean hasPathDFS(MyGraph<E> graph, Vertex current, Vertex target, Vertex parent) {
	    //creates set to see if visited don't visit nodes more than once 
		Set<Vertex> visited = new HashSet<>();
	    return dfs(current, target, parent, visited, graph);
	}
	//recursive method for dfs
	private boolean dfs(Vertex current, Vertex target, Vertex parent, Set<Vertex> visited, MyGraph<E> graph) {
	   // if current == target true, cycle forms 
		if (current.equals(target)) return true;
		//else add current to vistited
	    visited.add(current);
	    for (Edge edge : current.neighbors) {
	        Vertex neighbor = edge.destination;
	        //if does not go backwards and is unvistited 
	        if (!neighbor.equals(parent) && !visited.contains(neighbor)) {
	        	//recursive dfs with neighbor
	        	if (dfs(neighbor, target, current, visited, graph)) {
	                return true;
	            }
	        }
	    }
	    return false;
	}
}