package edu.frcc.csc1061jsp26.SentimentAnalysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SentimentAnalyzer {

    public static void main(String[] args) {
    	//Creates a map using MyHashMap
        Map<String, Integer> sentimentMap = new HashMap<>();

        // Load sentiment data from file
        try (BufferedReader reader = new BufferedReader(new FileReader("sentiments.txt"))) {
            String line;
            //while Splits each word and score in text file
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                	//trims all , and spaces
                    String word = parts[0].trim();
                    //sets score
                    int score = Integer.parseInt(parts[1].trim());
                    //puts word and score into map
                    sentimentMap.put(word, score);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading sentiments.txt: " + e.getMessage());
            return;
        }
        //UI
        Scanner scanner = new Scanner(System.in);
        String input;
        int totalSentiment = 0;
        int wordCount = 0;
        String previousWord = null;
        System.out.println("$ java SentimentAnalysis");
        System.out.println("Enter text (type 'END' to finish):");
        //loop that goes until end is typed
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("END")) {
                break;
            }
            //only grabs words entered ignores punctuation and spaces 
            String[] words = input.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
            //goes through every word entered
            for (String word : words) {
              //As long as the word is anything
            	if (!word.isEmpty()) {
                 //inc wordcount
            		wordCount++;
                  //gets vaule for each word
            		Integer sentimentScore = sentimentMap.get(word);
                    if (sentimentScore != null) {
                    	//adds to total value, if has value
                        totalSentiment += sentimentScore;
                    }

                    // Check for two-word phrases
                    if (previousWord != null) {
                        String phrase = previousWord + " " + word;
                        //checks two word pharse in map
                        Integer phraseScore = sentimentMap.get(phrase);
                        if (phraseScore != null) {
                        	//adds two word phrases to total score
                            totalSentiment += phraseScore;
                        }
                    }

                    previousWord = word;
                }
            }
        }
        //Output if text is entered
        if (wordCount > 0) {
            double averageSentiment = (double) totalSentiment / wordCount;
            System.out.println("Number of words: " + wordCount);
            System.out.println("Total sentiment: " + totalSentiment);
            System.out.printf("Average sentiment: "+ averageSentiment);
        } else {
            System.out.println("No words entered.");
        }
    }
}