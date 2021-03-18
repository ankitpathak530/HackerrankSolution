package HackerRank;

public class JavaAnagram {
   public static String  main(String[] args) {
	   String s1="panagram";
	   String s2="grampana";
	   
	   s1.toLowerCase();
	   s2.toLowerCase();
	   int fr1[]= new int[26];
	   int fr2[]= new int[26];
	   
	   for(char ch:s1.toCharArray())
		   fr1[ch-97]++;
	   for(char ch:s2.toCharArray()) 
		   fr2[ch-97]++;
	   
	   String s3="";
	   String s4="";
	   
	   for(int n:fr1)
		  s3+=Integer.toString(n);
	   for(int n:fr2)
		  s4+=Integer.toString(n);
	   
	   return (s3.equals(s4))?"Anagrams":"Not Anagrams";
   }
}
