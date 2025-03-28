package edu.frcc.csc1061jsp26.MyBookTree;

public class BookCreator {

	public static void main(String[] args) {
		BookTree book = new BookTree("Trees for dummies");
		
		book.addBookNode("Chapter 5", 5, 0, 0);
		book.addBookNode("Chapter 1", 1, 0, 0);
		book.addBookNode("Chapter 4", 4, 0, 0);
		book.addBookNode("Chapter 2", 2, 0, 0);
		book.addBookNode("Chapter 3", 3, 0, 0);
		
		
		for(BookNode bNode:book) {
			System.out.println(bNode);
		}

	}

}
