package HackerRank;

public class AlternatingCharacter {
  public static void main(String[] args) {
	  System.out.println(alternatingCharacters("ABABABAB"));
  }
  static int alternatingCharacters(String s) {
      int k=0,count=0;
    for(int i=1;i<s.length();i++ ){
       if(s.charAt(k)==s.charAt(i))
         count++;
       else
         k=i;
 } 
 return count;
}   
}
