package com.stackroute.datamunger;

import java.util.Scanner;

/**
 * @author wiprousr92
 *
 */
public class DataMunger {

	private static Scanner sc;

	public static void main(String[] args) {
		DataMunger datamunger = new DataMunger();
		sc = new Scanner(System.in);
		/* read a sentence from the user */
		String sentence = sc.nextLine();

		/*
		 * call getWordCount() method which should return no. of words present in the
		 * string and display the same
		 */
		Object wordCount = datamunger.getWordCount(sentence);
		System.out.println("Word count is : " + wordCount);

	}

	/*
	 * This method is used to calculate the no. of words present in the given
	 * string. Please note that in a sentence, words are split by space. Please
	 * change the method return type to int
	 */
	public Object getWordCount(String string) {
		
		int counter;
		
		if (string.isEmpty())
			counter = 0;
		else {
			String[] sen = string.split("\\s+");
			counter = sen.length;
		}
		System.out.println(counter);
		return counter;
	}

}
