package HackerRank;
import java.util.Set;
import java.util.HashSet;

public class TwoCharacter {
  public static void main(String[] args) {
	 System.out.println(getmax("beabeefeab"));
	 String s="beabeefeab";
	 char c[] =s.toCharArray(); 
     int n =c.length; 
     System.out.println(removeDuplicate(c,n)); 
  }
  public static int getmax(String s) {
	  int total_length=0,max_length=0,sl=s.length(),i=0;
      String rs="";
      boolean flag=true;

   Set<Character> ch = new HashSet<Character>();
     for(char c:s.toCharArray())
       ch.add(c);
     char c[] = new char[ch.size()];
     for(char character:ch) {
       c[i]=character;i++; }
     
     for(int l=0;l<c.length-1;l++) {      
        for(int k=l+1;k<c.length;k++) {
        flag=true;
        rs="";
            for(i=0;i<sl;i++) {
               if(s.charAt(i)==c[l] || s.charAt(i)==c[k]) 
                     rs=rs+Character.toString(s.charAt(i)); }
            
            for(i=0;i<rs.length()-1;i++) {
              if(rs.charAt(i)==rs.charAt(i+1))
                 flag=false;  }
             
            if(flag)
                total_length=rs.length();
            if(flag && total_length>max_length)
                 max_length=total_length;
     }
  } 
        return max_length;
 }  
}
