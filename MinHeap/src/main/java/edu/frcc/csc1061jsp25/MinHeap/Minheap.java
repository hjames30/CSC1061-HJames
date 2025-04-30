package edu.frcc.csc1061jsp25.MinHeap;

import java.util.ArrayList;
import java.util.List;

public class Minheap<E extends Comparable<E>> {
	private List<E> heapArr;

	public Minheap() {
		super();
		heapArr = new ArrayList<>();

	}

	public boolean isEmpty() {
		return heapArr.isEmpty();
	}

	public int size() {
		return heapArr.size();
	}

	public List<E> getHeap() {
		return heapArr;
	}

	private int getlChild(int post) {
		int lchild = (2 * post) + 1;
		if (lchild >= heapArr.size()) {
			return -1;
		}
		return lchild;
	}

	private int getRchild(int post) {
		int rchild = (2 * post) + 2;
		// return rchild = rchild >= heapArr.size() ? -1 : rchild;
		if (rchild >= heapArr.size()) {
			return -1;
		}

		return rchild;
	}

	private int getParrent(int post) {
		if (post <= 0) {
			return -1;
		} else {
			return (post - 1) / 2;
		}
	}

	public void add(E entry) {
		heapArr.add(entry);
		swimUp(heapArr.size() - 1);
	}

	private void swimUp(int current) {
		int parrent = getParrent(current);
		while (current != 0 && heapArr.get(current).compareTo(heapArr.get(parrent)) < 0) {
			swap(current, parrent);
			current = parrent;
			parrent = getParrent(current);
		}

	}

	private void swap(int current, int parrent) {
		E temp = heapArr.get(current);
		heapArr.set(current, heapArr.get(parrent));
		heapArr.set(parrent, temp);

	}

	public E remove() {
		return remove(0);
	}

	public E remove(int pos) {
		swap(pos, heapArr.size() - 1);
		E removed = heapArr.remove(heapArr.size() - 1);
		if (heapArr.size() > 0) {
			siftDown(pos);
		}
		return removed;
	}

	private boolean isLeaf(int pos) {
		return (pos >= heapArr.size() / 2) && pos < heapArr.size();
	}

	private void siftDown(int pos) {
		while (!isLeaf(pos)) {
			int lchild = getlChild(pos);
			int rchild = getRchild(pos);

			E lchildEntry = heapArr.get(lchild);
			E childEntry = lchildEntry;
			int child = lchild;
			if (rchild > -1) {
				E rchildEntry = heapArr.get(rchild);
				if (rchildEntry.compareTo(lchildEntry) < 0) {
					childEntry = rchildEntry;
					child = rchild;
				}
			}
			if (heapArr.get(pos).compareTo(childEntry) > 0) {
				swap(pos, child);
				pos = child;
			}
			else {
				break;
			}

		}

	}
}
