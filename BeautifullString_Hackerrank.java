package HackerRank;

public class BeautifullString_Hackerrank {
	 public static void mian(String[] args) {
	    	System.out.println(beautifulBinaryString("0101010"));
	    }
	 static int beautifulBinaryString(String b) {
	      int count=0;
	      for(int i=1;i<b.length()-1;i++){
	         if(b.charAt(i)=='1'){
	            if(b.charAt(i-1)=='0'){
	              if(b.charAt(i+1)=='0'){
	                 count++;i+=2;
	              }
	            }
	         }
	         else
	           continue;
	      }
	    return count;
	    }

}
