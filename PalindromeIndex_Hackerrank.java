package HackerRank;

import java.util.Stack;

public class PalindromeIndex {
	     public static void main(String []args){
	    	
      System.out.println(palindromeIndex("madlam"));
	   
	     }
	  public static int palindromeIndex(String s) 
	  {  
	    	
		  int l = s.length();
	        int i,j,a,b;
	        for (i=0, j=l-1; i<l; i++,j--){
	            if (s.charAt(i)!=s.charAt(j)) {
	            	System.out.println("i = "+i+"   j = "+j+"   ,,,,, "+(s.charAt(i)!=s.charAt(j)));
	            	break;
	            }
	               
	        }
	        if (i>j) return -1;
	        System.out.println(i);
	        for (a = i+1, b = j;a<j && b>i+1; a++,b--){
	            if (s.charAt(a)!=s.charAt(b))
	                return j;
	        }
	        return i;
	  }
	      
  }

