/*********************************************************************
// DictionaryApplication.java   Data Structures
//
/* Creates an ArchaicDictionary object, tests methods for the hashmap. Adds keys with values, searches, and prints
* @author Ethan Craycroft
* @version 1.0
* Assignment 5.1
* CS-215-ON Spring 2022
//********************************************************************
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryApplication 
{
	public static void main(String [] args)
	{
		String a;
		ArchaicDictionary dictionary = new ArchaicDictionary();
		
		/**
		 * File reader to scan text file and add keys/values to the dictionary
		 */
		try
		{
			File words = new File("ArchaicWordList");
			Scanner wordsReader = new Scanner(words);
			File definitions = new File ("ArchaicDefinitionList");
			Scanner defReader = new Scanner(definitions);
			while(wordsReader.hasNextLine() && defReader.hasNextLine())
			{
				dictionary.addEntry(wordsReader.nextLine(), defReader.nextLine());
			}
			wordsReader.close();
			defReader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}//end try-catch
		
		// Printing out the contents of the dictionary
		System.out.println("Printing the words and definitions: ");
		System.out.println(dictionary.archaicWords);
		
		// Searching for the key "smite"
		System.out.println();
		a = "smite";
		System.out.println("Searching for \"" + a + "\" in the archaic dictionary: ");
		System.out.println(dictionary.search(a));		
		System.out.println();
		
		// Searching for the key "watchword"
		a = "watchword";
		System.out.println("Searching for \"" + a + "\" in the archaic dictionary: ");		
		System.out.println(dictionary.search(a));		
		System.out.println();
		
		// Searching for the key "quiz"
		a = "quiz";
		System.out.println("Searching for \"" + a + "\" in the archaic dictionary: ");		
		System.out.println(dictionary.search(a));		
		System.out.println();
		
		// Searching for the key "bedlam"
		a = "bedlam";
		System.out.println("Searching for \"" + a + "\" in the archaic dictionary: ");		
		System.out.println(dictionary.search(a));
		
		// Searching for the key "timbrel"
		System.out.println();
		a = "timbrel";
		System.out.println("Searching for \"" + a + "\" in the archaic dictionary: ");		
		System.out.println(dictionary.search(a));

	}//end main
	
}//end class
