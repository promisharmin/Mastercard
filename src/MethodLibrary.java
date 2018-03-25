import java.util.*;

 public class MethodLibrary {
		
	  public void lengthAndLongestWord(String sentence) {
	    String actualSentence = sentence;
	    String longestWord = (Arrays.stream(actualSentence.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));
	    
	    System.out.println(longestWord);
	    System.out.println(longestWord.length());
		  	
	  }
	  
	}