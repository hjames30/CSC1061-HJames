package edu.frcc.csc1061jsp25.SerchEngine;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.select.Elements;

public class Search {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args)throws IOException {
		
		WikiFetcher wf = new WikiFetcher();
		Index index = new Index();
		
		String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";
		
		Elements paragraphs = wf.fetchWikipedia(url);

		
		index.indexPage(url,paragraphs);
		
		
		
		 url = "https://en.wikipedia.org/wiki/Programming_language";
		
		 paragraphs = wf.fetchWikipedia(url);

		
		index.indexPage(url,paragraphs);
		url = "https://en.wikipedia.org/wiki/Coffee_production_in_Indonesia";
		
		 paragraphs = wf.fetchWikipedia(url);

		
		index.indexPage(url,paragraphs);
		
		//index.printIndex();
		while(true) {
			System.out.println("Enter Search term: ");
			String term = input.next();
			System.out.println(index.getWord(term));
		}
		
	}

}
