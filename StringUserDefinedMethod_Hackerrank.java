package HackerRank;

public class StringUserDefinedMethod {
	public static String reverse(String str)
	   {
		if (str == null || str.equals("")) 
			return  str;
		return reverse(str.substring(1)) + str.charAt(0);
	   }
   public static String deleteCharacter(String str,int p) {
 	  return str.substring(0,p)+str.substring(p+1);
   }
}
