import java.util.*;

 public class MethodLibrary {
		
	  public void lengthAndLongestWord(String sentence) {
	    String actualSentence = sentence;
	    String longestWord = (Arrays.stream(actualSentence.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));
	    int lengthOfWord = longestWord.length();
	    
	    
	    
	// 	Following 2 line can be comment out if needed.
	    
	    System.out.println(longestWord);
	    System.out.println(lengthOfWord);
		  	
	  }
	  
	}