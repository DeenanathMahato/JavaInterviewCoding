package code.interview.test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CommonWordsInTwoSentences {
	
	public static String[] findCommonWords(String firstSentence, String secondSentence) {
		//convert sentences into words 
		String[] wordsInFirstSentence = firstSentence.split(" ");
		String[] wordsInSecondSentence = secondSentence.split(" ");
		
		//copy all words to set from first sentence
		Set<String> unicWords = new HashSet<>();
		Collections.addAll(unicWords, wordsInFirstSentence);
		
		//find common word in between first and second sentence
		Set<String> commonWords = new HashSet<>();
		for(String word : wordsInSecondSentence) {
			if(unicWords.contains(word)) {
				commonWords.add(word);
			}
		}
		
		return commonWords.toArray(new String[] {});
	}
	
	public static void main(String[] args) {
		String sentence1 = "blue cat behind red mouse";
		String sentence2 = "red cat behind orange mouse";

		String[] commonWords = findCommonWords(sentence1, sentence2);
		for(String word: commonWords) {
			System.out.println(word);
		}
	}
}
