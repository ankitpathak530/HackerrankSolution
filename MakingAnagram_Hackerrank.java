package HackerRank;

import java.util.ArrayList;
import java.util.Collections;

public class MakingAnagram {
   public static void main(String[] args) {
	  String s1="absdjkvuahdakejfnfauhdsaavasdlkj";
	  String s2="djfladfhiawasdkjvalskufhafablsdkashlahdfa";
	  System.out.println(makingAnagrams(s1,s2));
   }
   public static int makingAnagrams(String s1, String s2) {
	  
   
	
	      int i=0,k=0,l=0,j=0;  
	      StringBuffer sb=new StringBuffer(s2);  
	   
	     for(i=0;i<s1.length();i++){
	            for(j=0;j<sb.length();j++){
	                    if(s1.charAt(i)==sb.charAt(j)){
	                            k++; sb.deleteCharAt(j); break;
	                     }
	                    else if(j==sb.length()-1)
	                            l++; 
	            }
	     }
	     return l+(s2.length()-k);
	   
  }
}
