package HackerRank;

public class CaesarCapihar {
	public static void main(String[] args) {
		String string="www.abc.xy";
		int d,o=87%26;
		String result = "";// initialised the variable
		 
	        for (int i = 0 ; i < string.length(); i++){
	             if(string.charAt(i)>='a' && string.charAt(i)<='z') { 
	                 char ch=string.charAt(i);
	                d=(int)ch+o;
	                if(d>122) {
	                     d%=122;d+=96;}           
	                 result += Character.toString((char)d);
	               }
	             else if(string.charAt(i)>='A' && string.charAt(i)<='Z') { 
	                 char ch=string.charAt(i);
	                 d=(int)ch+o;
	                 if(d>90){ 
	                     d%=90;d+=64; }        
	                 result += Character.toString((char)d);
	               }             
	             else
	                 result += Character.toString(string.charAt(i));        
	            }
	        System.out.println(result);
	 }
		
	}


