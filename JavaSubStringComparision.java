package HackerRank;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class JavaSubStringComparision {
  public static void main(String[] args) {
	 String s="welcometojava";
	 SortedSet<String> words = new TreeSet<String>();
	 int l=3;
	 for(int i=0;i<s.length()-l;i++) {
		 int k=i;
		 while(k+l<s.length()) {
			 int p=k+l;
			 String sch = s.substring(k,p);
			 words.add(sch);
			k=p;
			 
			 if(k+l==s.length()) {
				String chu =s+'a';
				int pp=k+l;
				 sch=chu.substring(k,pp);
				 words.add(sch);
				 k=p;
			 }
			 
		 }
		 
	 }
	String grt = Collections.max(words);
	String smt = Collections.min(words);
	System.out.println(grt+"   min "+smt);
	 Iterator<String> i = words.iterator(); 
     while (i.hasNext()) 
         System.out.println(i.next()); 
  }
}
