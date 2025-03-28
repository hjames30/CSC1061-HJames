package edu.frcc.csc1061jsp26.MyBookTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class BookTree implements Iterator<BookNode> {
	private BookNode root;

	public BookTree(String title) {
		root = new BookNode(title, 0, 0, 0);
	}

	public BookNode getBook() {
		return root;
	}

	public boolean addBookNode(String title, int cNum, int sNum, int sSNum) {
		BookNode node = new BookNode(title, cNum, sNum, sSNum);
		// Is this a chapter
		if (sNum == 0) {
			root.getChildNodes().add(node);
			Collections.sort(root.getChildNodes());
			return true;
		}
		// Is this a section
		if (sSNum == 0) {
			for (BookNode cNode : root.getChildNodes()) {
				if (cNode.getChapNum() == cNum) {
					cNode.getChildNodes().add(node);
					Collections.sort(cNode.getChildNodes());
					return true;
				}
			}
		}
		// then its a subsec

		for (BookNode sNode : root.getChildNodes()) {
			for (BookNode cNode : root.getChildNodes()) {
				if (cNode.getChapNum() == cNum) {
					if (sNode.getSecNum() == sNum) {
						sNode.getChildNodes().add(node);
						Collections.sort(sNode.getChildNodes());
						return true;
					}
				}
			}
		}
		return false;
	}public Iterator<BookNode> iterator() {
		return new BookNodeIterator(root);
	}
	//Preorder Tree Traversal
	private class BookNodeIterator implements Iterator<BookNode>{
		Deque<BookNode> stack;
		public BookNodeIterator(BookNode node) {
			stack = new ArrayDeque<BookNode>();
			stack.push(node);
			
			
		}
		
		@Override
		public boolean hasNext() {
			if(stack.isEmpty()) {
				return false;
			}
			return true;
			//return !stack.isEmpty();
		}

		@Override
		public BookNode next() {
			BookNode node = stack.pop();
			List<BookNode> children = node.getChildNodes();
			List<BookNode> listCopy = new ArrayList<>(children);
			Collections.reverse(listCopy);
			for(BookNode child: listCopy) {
				stack.push(child);
			}
			return node;
		}
		
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BookNode next() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
