import java.util.*;
import java.util.regex.*;

public class StrongPasswordHackerrank {
     public static void main(String[] args) {
    	 
     }
     
     //1st approach 
     
     
     public static int minimumNumber(int n, String password) {
    	    
         int count=0;
        
         Pattern p1 = Pattern.compile("[0-9]");
         Matcher m1 = p1.matcher(password);
         if(m1.find())
            count++;
        
         Pattern p2 = Pattern.compile("[a-z]");
         Matcher m2 = p2.matcher(password);
         if(m2.find())
             count++;
          
          Pattern p3 = Pattern.compile("[A-Z]");
          Matcher m3 = p3.matcher(password);
          if(m3.find())
             count++;
          
          
          Pattern p4 = Pattern.compile("[!@#$%^&*()-+ ]");
          Matcher m4 = p4.matcher(password);
          if(m4.find())
             count++;
   
                
          count = 4 - count;
          
          if((n + count) < 6)
              return (count + (6 - (n + count)));
          else
              return (count);
                     
      }
     
     
     
     
     // 2nd approach using ASCII Value
     
     
     public static int StrongPassword(int n, String password) {
    	 
    	 int count = 0;
         
    	 for(int i=0;i<n;i++){
             if(password.charAt(i)>=65 && password.charAt(i)<=90)
               count++;
             else if(password.charAt(i)>=97 && password.charAt(i)<=122)
             	count++;
             else if(password.charAt(i)>=48 && password.charAt(i)<=57)
             	 count++;
             else
             	 count++;
           }

    	 count = 4 - count;
         
         if((n + count) < 6)
             return (count + (6 - (n + count)));
         else
             return (count);        
     }
     
     
     
     
}
