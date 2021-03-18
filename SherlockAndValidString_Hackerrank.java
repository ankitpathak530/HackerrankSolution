package HackerRank;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SherlockAndValidString { 
	public static void main(String []args){
		
    System.out.println("Hello World");
    String s="aabbccc";
    Map<Character,Integer> mp = new HashMap<Character,Integer>();
    int inc;
    for(char ch:s.toCharArray()){
        inc=0;
        if(mp.containsKey(ch)){
            inc=mp.get(ch);
            mp.put(ch,inc++);
        }else{
            mp.put(ch,inc);
        }
        Set<Integer> it = new HashSet<Integer>(mp.values());
        
        
    }
    System.out.println(mp.toString());
 }
	  static String isValid(String s) 
	    {
	     int mx=0,mn=0;
	        Map<Character,Integer> mp = new HashMap<Character,Integer>();
	        for(char ch:s.toCharArray()){
	            if(mp.containsKey(ch)){
	                int inc=mp.get(ch);
	                mp.put(ch,++inc);
	            }else
	                mp.put(ch,1);
	            }
	             //mx=Collections.max(mp.values());
	             //mn=Collections.min(mp.values());
	        Set<Integer> it = new HashSet<Integer>(mp.values());
	        if(it.size()==1)
	          return "YES";
	        ArrayList<Integer> al = new ArrayList<Integer>(mp.values());
	        int mncount=0,mxcount=0;
	        mx=Collections.max(al);
	        mn=Collections.min(al);
	        for(int i=0;i<al.size();i++){
	            if(al.get(i)==mn)
	                mncount++;
	            else if(al.get(i)==mx)
	                mxcount++;
	         }    
	        if(mxcount==mxcount)
	            return "NO";
	         if((mncount==1)||(mxcount==1)&&((mx-mn)==1))
	            return "YES";
	        return "NO";
	    }
	 
}
