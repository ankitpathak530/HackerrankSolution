package HackerRank;

import java.util.ArrayList;

public class Anagaram {

	public Anagaram() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println(anagram("xyyx"));
	}	
	static int anagram(String s) {
		  int l=s.length();
	        if(l%2!=0)
	           return -1; 
            int ans=0;
	        String s1=s.substring(0,l/2);
	        String s2=s.substring(l/2,l);
	        
	        ArrayList<Character> al = new ArrayList<Character>();
	        for(char ch:s2.toCharArray())
	        	al.add(ch);
	        
	        for(char ch:s1.toCharArray()) {
	        	if(al.contains(ch)) {
	        		int n=al.indexOf(ch);
	        		al.remove(n);
	        	}
	        	else
	        		ans+=1;
	        }
	              
	      return ans;

	}
    
}
