package edu.frcc.csc1061jsp25.Exam2;

import java.io.File;
import java.util.Iterator;

public class FileSizeFinder {

	public static void main(String[] args) {
		//will be different on my desktop vs school computer/ do not change anything else 
		String filePath = "C:\\Users\\Holden\\Downloads\\FileSizeTest";
		
		File file = new File(filePath);
		
		if (!file.exists()) {
			System.out.println("The file " + filePath + " does not exist.\nExiting ...");
			System.exit(-1);
		}
		
		FileTree tree = new FileTree(filePath);
		
		System.out.println("File size listing");
		for (FileNode fileNode: tree) {
			if (fileNode.getFile().isDirectory()) {
				long size = 0;
				for (FileNode child : fileNode.getChildNodes()) {
					size += child.getFileSize();
				}
				fileNode.setFileSize(size);
				System.out.println(fileNode);
			}
		}
		
		System.out.println("===============================================================================================");
		System.out.println("Breadth first listing of files");
		Iterator<FileNode> iterator = tree.breadthFirstIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
//white board notes for recursion 
//Another instance of the function happening within function 
//The ending function does not call any other function 
//after last it finishes the code that was left in function (printline) in blastoff
//needs a base case, what you are looking for in a recursive loop 
//focus on base case and the location 
//each step should get you closer to base case