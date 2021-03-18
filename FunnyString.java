package HackerRank;

public class FunnyString {
  public static void main(String[] args) {
	  System.out.println(funnyString("bcxz"));
  }
  static String funnyString(String s) {
      String r="";
      String sd="";
      int k,l=s.length()-1;
      
      for(int i=0;i<l;i++){
       k=l-i;
       int dif1=Math.abs((int)(s.charAt(i))-(int)(s.charAt(i+1)));
        sd+=Integer.toString(dif1);
       int dif2=Math.abs((int)(s.charAt(k))-(int)(s.charAt(k-1)));
        r+=Integer.toString(dif2);
      }
      return r.equals(sd)?"Funny":"Not Funny";
   }
}
