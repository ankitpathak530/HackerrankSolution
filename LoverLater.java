/**
 * 
 */
package HackerRank;

/**
 * @author Ankit
 *
 */
public class LoverLater {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 4+4+5
      System.out.println(loverlater("bafhaef"));//bafhaeb bafhaab  baahaab
	}
	public static int loverlater(String s) {
		int ops=0;
	    for(int i = 0, j = s.length() - 1; i < j; i++, j--) 
	        ops += Math.abs((int)(s.charAt(j)-s.charAt(i)));
	    return ops;
	}
	   /*
	int operation =0,k;
	int l=s.length();
	for(int i=0;i<l/2;i++)
	{
	  k=l-1-i;
	  if(s.charAt(i)!=s.charAt(k))
	  {
	    if(s.charAt(i)>s.charAt(k)) {
	        operation+=(int)(s.charAt(i)-s.charAt(k));
	        s=s.substring(0,i)+s.charAt(k)+s.substring(i+1);
	    }
	     else {
	        operation+=(int)(s.charAt(k)-s.charAt(i));
	        s=s.substring(0,k)+s.charAt(i)+s.substring(k+1);
	     }
	    System.out.println(s);
	  }

	}
	return operation;*/
 
}