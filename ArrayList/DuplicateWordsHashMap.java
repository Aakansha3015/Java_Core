package ArrayList;
import java.util.*;
import java.util.Scanner;
import java.util.Map;
// How to find repeated/duplicated words in a string using Java
public class DuplicateWordsHashMap
{
	    public static void main(String[] args) 
	    {
	        System.out.println("Enter string to analyse:");
	        Scanner sn = new Scanner(System.in);
	        String input = sn.nextLine();
	       
	        String[] words = input.split(" ");         					  // first let us split string into words
	        
	        Map<String,String> wordMap = new HashMap<String,String>();    // adds all words into a map   // we also check whether the word is already in map!
	        for(int i=0;i<words.length;i++) 
	        {
	            String word = words[i].toUpperCase(); 					   // for case insensitive comparison
	            if(wordMap.get(word)!=null) 
	            {
	                System.out.println("Duplicated/Repeated word:"+word);  // we found a duplicated word!
	            }
	            else 
	            {
	                wordMap.put(word, word);
	            }
	        }
	    }
	}