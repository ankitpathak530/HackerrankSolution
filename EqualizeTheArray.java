package HackerRank;

public class EqualizeTheArray {
  public static void main(String...args) {
	  int ar[] = {1,2,2,3};
      int count=1,gcount=0;
	  
	  for(int i=0;i<ar.length;i++){
		  if(ar[i]==0)
			  continue;
		  for(int j=i+1;j<ar.length;j++) {
			  if(ar[i]==ar[j]) {
				  count++;ar[j]=0;
			  }
		   }
		   if(count>gcount)
			   gcount=count;count=1;
	   }
	  System.out.println(ar.length-gcount);
  }
}
