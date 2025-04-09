package edu.frcc.csc1061jsp25.MyTreeMap;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class MyTreeMap<K, V> implements Map<K, V>,Iterable<K>{

	private Node root = null;
	private int size = 0;

	private class Node {
		private K key;
		private V value;

		private Node left;
		private Node right;

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
		Comparable<K> k = (Comparable<K>)key;
		
		while(current!= key) {
			if(k.compareTo(current.key)<0) {
				current = current.left;
			}else if(k.compareTo(current.key)>0) {
				current = current.right;
			}
			else {
				return false;
			}
		}
		return true;
	}
	/*
	 * if(get(key)!=null){
	 * return true;
	 * }
	 * return false;
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
			}else if(k.compareTo(current.key)>0) {
				current = current.right;
			}else {
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
			return null;
		}

		Node parrent = null;
		Node current = root;
		Comparable<K> k = (Comparable<K>) key;
		while (current != null) {
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
		size++;
		return null;
	}
	//homework
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

	public Iterator<K> iterator() {
		return new RecursiveIterator();
		
	}
	private class RecursiveIterator implements Iterator<K>{
		private Queue<K> list = new ArrayDeque<>();
		
		public RecursiveIterator() {
			inOrder(root);
		}
		private void preOrder(Node node) {
			if(node ==null) {
				return;
			}
				list.add(node.key);
				preOrder(node.left);
				preOrder(node.right);
			}
		private void postOrder(Node node) {
			if(node ==null) {
				return;
			}
				postOrder(node.left);
				postOrder(node.right);
				list.add(node.key);
				
			}
		private void inOrder(Node node) {
			if(node ==null) {
				return;
			}
				inOrder(node.left);
				list.add(node.key);
				inOrder(node.right);
				
				
			}
		@Override
		public boolean hasNext() {
			return !list.isEmpty();
			
		}
		@Override
		public K next() {
			return list.remove();
		}
				
		
	}
}
