/*********************************************************************
// ArchaicDictionary.java   Data Structures
//
/* Creating a hashmap to hold keys (words) and values (definitions). Methods to add to the hash map and to search the hash map.
* @author Ethan Craycroft
* @version 1.0
* Assignment 5.1
* CS-215-ON Spring 2022
//********************************************************************
*/

import java.util.HashMap;

public class ArchaicDictionary 
{
	public HashMap<String, String> archaicWords;
	
	public ArchaicDictionary()
	{
		archaicWords = new HashMap<String, String>();
	}//end empty-argument constructor

	/**
	 * 
	 * @param key - the word to be added
	 * @param value - the defintion to be added
	 */
	public void addEntry(String key, String value)
	{
		archaicWords.put(key, value);
	}//end addEntry
	
	/**
	 * 
	 * @param key - the word to be searched for
	 * @return returns the key (word), the value (definition) and the hashcode for the key
	 */
	public String search(String key)
	{
		String value = archaicWords.get(key);
		int hashCode = key.hashCode();
		return (key + " - " + value + " - (" + hashCode + ")");
	}//end search
	
}//end class
