package edu.frcc.csc1061jsp25.ArrayAndLinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {
	private Node head;
	private int size;

	private class Node {
		E data;
		Node next;

		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

	public MyLinkedList() {
		head = null;
		size = 0;
	}

	@Override
	public int size() {
		// without implementing size
		// int count =0;
		// for(Node node=head; node!= null; node=node.next){
		// count++;}
		// return count;

		return size;
	}

	@Override
	public boolean isEmpty() {
		// or head==null
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {

		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		Node newNode = new Node(e);
		Node node = null;
		if (head == null) {
			head = newNode;
		} else {
			for (node = head; node.next != null; node = node.next) {

			}
			node.next = newNode;

		}
		size++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		size = 0;
		head = null;

	}

	@Override
	public E get(int index) {
		Node node = getNode(index);
		return node.data;
	}

	@Override
	public E set(int index, E element) {
		Node node = getNode(index);

		E old = node.data;
		node.data = element;
		return old;
	}

	private Node getNode(int index) {
		// TODO Auto-generated method stub
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		Node node = head;

		for (int i = 0; i < index; i++) {
			node = node.next;

		}
		return node;
	}

	@Override
	public void add(int index, E element) {
		Node node = new Node(element);
		if(index==0) {
			node.next=head;
			head=node;
			
		}else {
		
		Node prev =getNode(index-1);
		node.next=prev.next;
		prev.next=node;
		}
		size++;
	}

	@Override
	public E remove(int index) {
		
		Node node = getNode(index);
		E data = node.data;
		if(index ==0) {
			head = head.next;
		}else {
		Node prev = getNode(index-1);
		prev.next = prev.next.next;
		}
		return data;
		
	}

	@Override
	public int indexOf(Object o) {
		int i=-1;
		for( i =0; o.equals(getNode(i).data);i++) {
			return i;
		}
		return i;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
