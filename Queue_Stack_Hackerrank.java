package HackerRank;

public class Queue_Stack {

		   public static void main(String args[]) {
		      String str = "this is Java";
		      System.out.println(str.length());
		      str=removeCharAt(str, 11);
		      System.out.println(str);
		      System.out.println(removeCharAt(str, 10));
		      System.out.println(removeCharAt(str, 11));
		      System.out.println(str.length());
		   }
		   public static String removeCharAt(String s, int pos) {
		      return s.substring(0, pos) + s.substring(pos + 1);
		   }
		
}
