package HackerRank;

public class QueenAttack {
  public static void main(String...args) {
	  int n,k,r_q=0,c_q=3; 
	  int[][] obstacles =new int[5][5];
	  obstacles[4][4]=1;
	  obstacles[3][1]=1;
	  obstacles[1][2]=1;
	  n=5;
	  int count=0;
	  
	  int qChart[][] = new int[n][n];
	  for(int tr=r_q-1;tr>=0;tr--) {
		  if(isObstacle(tr,c_q,obstacles))
			  count++;
		  else
			  break;
	  }
	  System.out.println("From postion to Top : "+count);
	  for(int tr=r_q+1;tr<n-1;tr++) {
		  if(isObstacle(tr,c_q,obstacles)) 
			 count++;
		   else
			  break;
	  }
	  System.out.println("From postion to bottom : "+count);
	  //LR/RL
	  for(int l=c_q-1;l>=0;l--) {
		  if(isObstacle(r_q,l,obstacles)) 
			 count++;
		   else
			  break;
	  }
	  System.out.println("From postion to left : "+count);
	  for(int r=c_q+1;r<n;r++) {
		  if(isObstacle(r_q,r,obstacles)) 
			 count++;
		   else
			  break;
	  }
	  System.out.println("From postion to Right : "+count);
	  //Diagonal
	  int tc=c_q;
	  for(int td=r_q-1;td>=0;td--) {
		  if(isObstacle(td,tc,obstacles)) { 
			 count++;tc--; }
		   else
			  break;
	  }
	  tc=c_q+1;
	  for(int td=r_q+1;td<=n-1;td++) {
		  if(tc==(n-1) || td==(n-1))
			  break;
	
		  if(isObstacle(td,tc,obstacles)) { 
			 count++;tc++; }
		   else
			  break;
	  }
	  System.out.println(count);
	  
	  
  }
  public static boolean isObstacle(int r,int c,int obstacle[][]) {
	   if(obstacle[r][c]!=0)
		   return false;
	   else
		   return true;
  }
}
