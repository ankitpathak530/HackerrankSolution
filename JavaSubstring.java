package programming.Ankit;

public class JavaSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="ankit";
        
         int k=3;
         String smallest = s.substring(0,k);
         String largest  = "";
         for(int i=0;i<s.length()-k+1;i++){
		         if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k);
		         if(s.substring(i,i+k).compareTo(largest) >0) largest = s.substring(i,i+k); 
           }
         System.out.println(largest);
         System.out.println(smallest);

     }
	}

