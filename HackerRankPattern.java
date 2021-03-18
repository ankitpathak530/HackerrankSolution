package programming.Ankit;

public class HackerRankPattern {
	  public static void main(String[] args)
	  {
		  int num=4;
		 int n=num*2-2;
		 int s=n-2;
		  for(int i=0;i<=n;i++)
		  {
			  for(int j=0;j<=n;j++)
			  {

				if(j<i || j>=7-i && i<6)
				{
					
				  System.out.print(+s);	
				  s--;
				}
				  if(i==0 || i==6)
				  {
					  System.out.print(""+num);  
					  
				  }
				  else if((i>0 && i<4) && (j==i && j<=6-i))
				  {
				     for(int k=i;k<=6-i;k++)
				     {
				    	 System.out.print(""+(4-i));
				    	 s=n-2;
				     }
				  }											
				 else
				 {
					 
				 }
			  }
			  
			 System.out.println();
		  }
	  }
	}
