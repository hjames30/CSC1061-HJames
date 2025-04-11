package edu.frcc.csc1061jsp25.Exam2;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;



public class FileTree implements Iterable <FileNode> {

	private FileNode root;
	
	public FileTree(String path) {
		root = new FileNode(path);
		buildTree(root);
	}

	/**
	 * Return a depth first post-order traversal iterator 
	 */
	@Override
	public Iterator<FileNode> iterator() {

		return new DepthFirstIterator();
	}
	
	/**
	 * 	TODO for Exam 2
	 *  Use recursion to build the tree from the directory structure.
	 *  For each of node starting from the root node use listFiles() from File to get 
	 *  the list of files in that directory/folder.
	 *  Create a node for each of the files and add it to a list of child nodes for the node
	 *  Do this recursively for all the nodes.  
	 * 
	 * @param fileNode
	 */
	
	private void buildTree(FileNode fileNode) {
		File files = fileNode.getFile();
		
		if(files.isDirectory()) {
			File[] file = files.listFiles();
			if(file!=null) {
				for(File F : file) {
					FileNode childNode = new FileNode(F);
					fileNode.getChildNodes().add(childNode);
					buildTree(childNode);				}
			}
		}
		//call build tree for first node this will return children
		//then call build tree on all children 
		//if its a leaf node it does not list any children
		//code is maybe 10 lines long 
		//done recursively 
		
		
	
	}
	
	/**
	 * TODO for Exam 2
	 * Iterator that does a post order traversal of the tree.
	 * For post-order traversal use the 2 stack approach outlined here: 
	 * https://www.geeksforgeeks.org/iterative-postorder-traversal/
	 * 
	 * @return 
	 */
	//do not use stack class use array dequqe
	private class DepthFirstIterator implements Iterator<FileNode> {
		private Deque<FileNode> stack1;
		private Deque<FileNode> stack2;
		public DepthFirstIterator() {
			// Create two stacks
			stack1= new ArrayDeque<>();
			stack2= new ArrayDeque<>();
			// Push root to first stack
			stack1.push(root);
			// Run while first stack is not empty
			while(!stack1.isEmpty()) {
				// Pop from stk1 and push it to stk2
				FileNode node = stack1.pop();
				stack2.push(node);
				//gets all children of poped node and all of the children's children
				for(FileNode child :node.getChildNodes()) {
					stack1.push(child);
				}
			}
		}

		@Override
		public boolean hasNext() {
			return !stack2.isEmpty();
		}
		
		@Override
		public FileNode next() {
			return stack2.pop();
		}
	}
	
	/**
	 *  Returns an iterator that does a breadth first traversal of the tree using a queue.
	 * 
	 * @return
	 */
	public Iterator<FileNode> breadthFirstIterator() {
		//uses queue
		return new BreadthFirstIterator();

	}	
	
	/** 
	 * TODO for Exam 2
	 * Iterator that does a breadth first traversal of the tree using a queue.
	 * 
	 */
	private class BreadthFirstIterator implements Iterator<FileNode> {
		private Queue<FileNode> queue;
		public BreadthFirstIterator() {
			queue = new ArrayDeque<>();
			queue.add(root);
		}
		
		@Override
		public boolean hasNext() {
			return !queue.isEmpty();
		}
		//nrm poll is allowed
		@Override
		public FileNode next() {
			FileNode node = queue.poll();
			for(FileNode child : node.getChildNodes()) {
				queue.add(child);
			}
			return node;
		}
		
	}
}
