package programming.Ankit;

public class ChockletFeastHackerrank {
   public static void main(String[] args) {
	   int n=15;
	   int c=3;
	   int m=2;
	   
	   int p,k=0;
	   p=n/c;
	   k=p;
	   System.out.println(k);
	   int temp=0;
	   while(p!=1) {
		   temp=p%m;
		   p=p/m;
		   p=p+temp;
		   k+=p;	 
	   }
	   System.out.println(k);
   }
}
