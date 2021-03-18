package HackerRank;
import java.util.HashSet;
import java.util.Set;

public class Pangrams {
  public static void main(String[] args) {
	  Set<Character> leter = new HashSet<Character>();
	  String s="We promptly judged antique ivory buckles for the prize";
	  s=s.toLowerCase();
	  for(char ch:s.toCharArray()) {
		  leter.add(ch);
	  }
	  System.out.println(leter.size());
	  if(leter.size()<=26){
		  System.out.println("Not Pangram String");
	  }else
		  System.out.println("Pangram String");
  }
}
