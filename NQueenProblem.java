package GeeksForGeeks.DynamicProgramming;

public class NQueenProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 4;
        boolean board[][] = new boolean[n][n];
        
		boolean ndiag[] = new boolean[2*n-1];   // --------> /   r+c
		boolean rdiag[] = new boolean[2*n-1];  // ---------> \   r-c+(n-1)
		boolean cols[] = new boolean[n];
		
		
		
		solve(board,0,cols,ndiag,rdiag,"");
	}
	
	public static void solve (boolean board[][], int row, boolean cols[], boolean ndiag[], boolean rdiag[], String ans)
	{
		
		if(row == board.length)
		{
			System.out.print(ans+" , ");
			return;
		}

		
		for(int col=0; col<board[0].length; col++)
		{
			 if(cols[col] == false && ndiag[row+col] == false && rdiag[row-col+(board.length-1)] == false)
			 {
				   board[row][col] = true;
				   cols[col] = true;
				   ndiag[row+col] = true;
				   rdiag[row-col+board.length-1] = true;
				
				   solve(board,row+1,cols,ndiag,rdiag, ans + row +"-"+ col+",");
				   
				   board[row][col] = false;
				   cols[col] = false;
				   ndiag[row+col] = false;
				   rdiag[row-col+board.length-1] = false;		   
			 }
		}
         		
		
		
		
	}

}
