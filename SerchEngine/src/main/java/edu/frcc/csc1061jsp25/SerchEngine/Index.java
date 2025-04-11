package edu.frcc.csc1061jsp25.SerchEngine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.jsoup.select.Elements;

public class Index {
	private Map<String,Set<TermCounter>> index = new HashMap<>();
	
	public void addWord(String term, TermCounter tc) {
		Set<TermCounter> set= index.get(term);
		
		if(set==null) {
			set = new HashSet<>();
			
		}
		set.add(tc);
		index.put(term, set);
	}
	
	public String getWord(String term) {
		Set<TermCounter> set = index.get(term);
		if(set == null) {
			return "";
		}
		String str = "";
		
		for(TermCounter tc: set) {
			str+=tc.getLabel()+"\n";
		}
		return str;
	}
	public void indexPage(String url,Elements paras) {
		TermCounter counter = new TermCounter(url);
		counter.processElement(paras);
		for(String term :counter.getKeySet()) {
			addWord(term,counter);
		}
	}
	public void printIndex() {
		for(String term:index.keySet()) {
			System.out.println(term);
			Set<TermCounter> set = index.get(term);
			for(TermCounter tc: set) {
				System.out.println("\t\t"+tc.getLabel());
			}
		}
	}
}
