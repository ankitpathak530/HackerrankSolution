package com.ds.Ankit_Pathak;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sparse_Arrays_HackerRank {

	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
	    // Write your code here
	    
	        String oneSentence = String.join(" ",strings);
	        System.out.println(oneSentence);
	        List<Integer> result = new ArrayList<Integer>();
	        
	        for(String str : queries)
	        {
	            Pattern pattern = Pattern.compile("\\b"+str+"\\b");
	            Matcher m = pattern.matcher(oneSentence);
	            int count = 0;
	            
	            while(m.find())
	                count++;
	            
	             result.add(count);
	        }
	        
	        return result; 
	    }
	
}
