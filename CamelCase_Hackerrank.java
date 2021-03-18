package HackerRank;

public class CamelCase {
  public static void main(String... args) {
	  String s="helloIAmAnkitKumarPathak";
	  int count=1;
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)>=65 && s.charAt(i)<=90)
          count++;
      }
      System.out.println(count);
  }
}
