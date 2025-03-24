package edu.frcc.csc1061jsp25.ArrayAndLinkedList;

import java.util.List;

public class MyDoubblyLinkedListTest {

	public static void main(String[] args) {
		List<Integer> ml = new MyDoubblyLinkedList<Integer>();

		ml.add(1);
		ml.add(2);
		ml.add(3);
		ml.add(4);
		ml.add(5);
		ml.add(6);
		ml.add(7);
		ml.add(8);
		/*
		for (int i = 0; i < ml.size(); i++) {
			System.out.print(ml.get(i) + " ");
		}
		System.out.println();

		ml.remove(2);
		
		for (int i = 0; i < ml.size(); i++) {
			System.out.print(ml.get(i) + " ");
		}
		*/
		
		
		for (Integer myInt : ml) {
			System.out.println(myInt);
		}
	}

}
