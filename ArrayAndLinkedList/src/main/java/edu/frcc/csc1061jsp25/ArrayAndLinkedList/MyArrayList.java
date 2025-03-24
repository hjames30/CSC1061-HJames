package edu.frcc.csc1061jsp25.ArrayAndLinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {

	private T[] array;
	private int size;

	@SuppressWarnings("unchecked")
	public MyArrayList() {
		array = (T[]) new Object[4];
		size = 0;
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public boolean isEmpty() {
		// return size==0;
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	private class MyIterator implements Iterator<T>{
		int index =0;
		
		@Override
		public boolean hasNext() {
			if(index > -1 && index < size) {
				return true;
			}
			return false;
		}

		@Override
		public T next() {
			if(index<0||index>size) {
				throw new IndexOutOfBoundsException();
			}
			T element = array[index];
			index++;
			
			return element;
			
		}
		
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator();
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

	@SuppressWarnings({ "unchecked" })
	@Override
	public boolean add(T e) {
		// checks to see if array is full if it is it doubles and clones it
		if (array.length <= size) {
			T[] biggerArray = (T[]) new Object[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				biggerArray[i] = array[i];
			}
			// sets array to be bigger array
			array = biggerArray;
		}
		// Adds e at [size]
		array[size] = e;
		size++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		int removeIndex = indexOf(o);
		if (removeIndex < 0) {
			return false;
		}
		for (int i = removeIndex; i < size - 1; i++) {
			array[i] = array[i + 1];

		}
		size--;
		return true;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
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

	}

	@Override
	public T get(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		return array[index];
	}

	@Override
	public T set(int index, T element) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();

		}
		T old = array[index];
		array[index] = element;
		return old;
	}

	@Override
	public void add(int index, T element) {
		if (index < 0 || size < index) {
			throw new IndexOutOfBoundsException();

		}
		// add elemtns at end to see if it fits in array
		add(element);
		// shift emelent to the right
		for (int i = size - 1; i > index; i--) {
			array[i] = array[i - 1];
		}
		// insert element at index
		array[index] = element;

	}

	@Override
	public T remove(int index) {
		T element = get(index);
		for (int i = index; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		size--;
		return element;
	}

	@Override
	public int indexOf(Object o) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (array[i].equals(o)) {
				index = i;
				break;
			}
		}
		return index;
	}

	@Override
	public int lastIndexOf(Object o) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (array[i].equals(o)) {
				index = i;

			}
		}
		return index;
	}
	
	
	@Override
	public ListIterator<T> listIterator() {
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
