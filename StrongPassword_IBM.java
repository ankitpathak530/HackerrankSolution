import java.util.regex.Matcher;
import java.util.regex.Pattern;

//IBM
public class StrongPassword_IBM {
   public static void main(String[] args) {
	        
	   String lower = "(?=.*[a-z])";
	   String upper = "(?=.*[A-Z])";
	   String digit = "(?=.*[0-9])";
	   String special = "(?=.*[\\w]).";
	   
	   
	   Pattern pattern = Pattern.compile("^"+lower+upper+digit+special+"{10,30}$");
	   Matcher matcher = pattern.matcher("A1+wwwwwwww");
	        
	   if(matcher.find()) {
		         System.out.println("yes");
	   }     
	   else {
		   System.out.println("no");
	   }
	   
	     
   }
}
