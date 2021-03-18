package HackerRank;

public class SuperReducedString {
	public static void main(String... args) {
	  String s ="aaabccdddd";
	  System.out.println();//abccddd
	  System.out.println(getString(s));
	  
	}
   public static String getString(String s) {	   
     int i=1; 
	 StringBuffer sb = new StringBuffer(s);
	 boolean flag=true;
     while(flag){
    	 flag=false;
    	 for(int i=0;i<sb.length()-2;i++) {
    		 if(sb.charAt(i)==sb.charAt(i+1))
    			 flag=true;
    		 
    	 }  
     }
     return sb.toString();
   }
} 


