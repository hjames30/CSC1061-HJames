package edu.frcc.csc1061jsp25.MyAVLTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class MyAVLTree<K, V> implements Map<K, V>, Iterable<edu.frcc.csc1061jsp25.MyAVLTree.MyAVLTree<K, V>.Node> {

	private Node root = null;
	private int size = 0;
	private List<Node> path = new ArrayList();

	protected class Node {
		private K key;
		private V value;

		private Node left;
		private Node right;
		public int height;

		public Node(K key, V value, MyAVLTree<K, V>.Node left, MyAVLTree<K, V>.Node right, int height) {
			super();
			this.key = key;
			this.value = value;
			this.left = left;
			this.right = right;
			this.height = height;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public K getKey() {
			return key;
		}

		public void setKey(K key) {
			this.key = key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public Node(K key, V value) {
			this.key = key;
			this.value = value;

		}

	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public boolean isEmpty() {

		if (root == null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		Node current = root;
		Comparable<K> k = (Comparable<K>) key;

		while (current != key) {
			if (k.compareTo(current.key) < 0) {
				current = current.left;
			} else if (k.compareTo(current.key) > 0) {
				current = current.right;
			} else {
				return false;
			}
		}
		return true;
	}
	/*
	 * if(get(key)!=null){ return true; } return false;
	 */

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(Object key) {
		Node current = root;
		Comparable<K> k = (Comparable<K>) key;

		while (current != null) {
			if (k.compareTo(current.key) < 0) {
				current = current.left;
			} else if (k.compareTo(current.key) > 0) {
				current = current.right;
			} else {
				return current.value;
			}
		}
		return null;
	}

	@Override
	public V put(K key, V value) {
		if (root == null) {
			Node newNode = new Node(key, value);
			root = newNode;
			size++;
			updateHeight(root);
			return null;
		}

		Node parrent = null;
		Node current = root;
		path.clear();
		Comparable<K> k = (Comparable<K>) key;
		while (current != null) {
			path.add(current);
			if (k.compareTo(current.key) < 0) {
				parrent = current;
				current = current.left;
			} else if (k.compareTo(current.key) > 0) {
				parrent = current;
				current = current.right;
			} else {
				V oldVal = current.value;
				current.value = value;
				return oldVal;
			}
		}
		Node newNode = new Node(key, value);
		if (k.compareTo(parrent.key) < 0) {
			parrent.left = newNode;
		} else {
			parrent.right = newNode;
		}
		updateHeight(newNode);
		balancePath();
		size++;
		return null;
	}

	private void updateHeight(Node node) {
		if (node.left == null && node.right == null) {
			node.height = 0;
		} else if (node.left == null) {
			node.height = node.right.height + 1;
		} else if (node.right == null) {
			node.height = node.left.height + 1;
		} else {
			node.height = Math.max(node.left.height, node.right.height) + 1;
		}
	}

	private int balanceFactor(Node current) {
		int balanceFactor = 0;
		if (current.left == null) {
			balanceFactor = current.height;
		}else if (current.right == null) {
			balanceFactor = -current.height;
		} else {

			balanceFactor = current.right.height - current.left.height;

		}
		return balanceFactor;
	}

	private void balancePath() {
		for (int i = path.size() - 1; i >= 0; i--) {
			Node current = path.get(i);
			updateHeight(current);
			Node parrent = null;
			if (i > 0) {
				parrent = path.get(i - 1);
			}
			switch (balanceFactor(current)) {
			case -2:
				if (balanceFactor(current.left) <= 0) {
					// LL imbalance
					balanceLL(current, parrent);

				} else {
					// LR imbalance
					balanceLR(current, parrent);
				}
				break;
			case 2:
				if (balanceFactor(current.right) >= 0) {
					// RR imbalance/Homework
					balanceRR(current, parrent);

				} else {
					// RL imbalance/Homework
					balanceRL(current, parrent);
				}
				break;

			}
		}
	}

	private void balanceLL(Node current, Node parrent) {
		Node ggp= parrent;
		Node gp = current;
		Node par = gp.left;
		Node ch = par.left;
		if (gp == root) {
			root = par;
		} else {

			if (ggp.right == gp) {
				ggp.right =par;
			} else {
				ggp.left = par;
			}
		}
		gp.left = par.right;
		par.right = gp;
		updateHeight(gp);
		updateHeight(ch);
		updateHeight(par);

	}
	private void balanceLR(Node current,Node parrent) {
		Node ggp = parrent;
		Node gp = current;
		Node par = gp.left;
		Node ch = par.right;
		if(gp==root) {
			root= ch;
		}else {
			//first link
			if(ggp.left==par) {
				ggp.left=ch;
			}
			else {
				ggp.right=ch;
			}
		}
		par.right=ch.left;
		gp.left=ch.right;
		ch.left=par;
		ch.right=gp;
		
		updateHeight(gp);
		updateHeight(par);
		updateHeight(ch);
	}
	private void balanceRR(Node current, Node parrent) {
		//HomeWork
	}
	private void balanceRL(Node current, Node parrent) {
		//Homework
	}

	
	
	// homework
	@Override
	public V remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Set keySet() {
		return null;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterator iterator() {
		return new NonRecursiveIterator();

	}

	private class NonRecursiveIterator implements Iterator<Node> {
		private Deque<Node> stack = new ArrayDeque<>();

		public NonRecursiveIterator() {
			pushOnStack(root);

		}

		public void pushOnStack(Node node) {
			Node current = node;
			while (current != null) {
				stack.push(current);
				current = current.left;

			}
		}

		@Override
		public boolean hasNext() {

			return !stack.isEmpty();
		}

		@Override
		public Node next() {
			Node node = stack.pop();
			V value = node.value;
			pushOnStack(node.right);
			return node;
		}
	}

	private class RecursiveIterator implements Iterator<V> {
		private Queue<V> list = new ArrayDeque<>();

		public RecursiveIterator() {
			inOrder(root);
		}

		private void preOrder(Node node) {
			if (node == null) {
				return;
			}
			list.add(node.value);
			preOrder(node.left);
			preOrder(node.right);
		}

		private void postOrder(Node node) {
			if (node == null) {
				return;
			}
			postOrder(node.left);
			postOrder(node.right);
			list.add(node.value);

		}

		private void inOrder(Node node) {
			if (node == null) {
				return;
			}
			inOrder(node.left);
			list.add(node.value);
			inOrder(node.right);

		}

		@Override
		public boolean hasNext() {
			return !list.isEmpty();

		}

		@Override
		public V next() {
			return list.remove();
		}

	}
}
