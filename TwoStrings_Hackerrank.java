package HackerRank;

public class TwoStrings {
  public static void main(String[] args) {
	twoString()  
  }
  static String twoStrings(String s1, String s2) {
      ArrayList<Character> al = new ArrayList<Character>();
      al=Arrays.asList(s2.toCharArray());
      for(char ch:s1.toCharArray()){
              if(al.contains(ch))
                 return "YES";
      }
      return "NO";
  }
}
