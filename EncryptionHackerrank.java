package programming.Ankit;

public class EncryptionHackerrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="iffactsdontfittotheorychangethefacts";
        
        int row,col,k=0,i,l=s.length();

        for(i=1;i<=9;i++) if((i*i)>l)break;
        i--;
     
        row=i;col=i+1;
        if((row*col)<l)
        	col=row;
       
      
        System.out.println(row+"--"+col);
        char arr[][]=new char[row][col];
        for(i=0;i<row;i++) {
        	for(int j=0;j<col;j++) {
        		arr[i][j]=' ';
        	}
        }
        for(i=0;i<row;i++) {
        	for(int j=0;j<col && k<l;j++) {
        		arr[i][j]=s.charAt(k);
        		k++;
        	}
        }
        
        String t="";int j=0;
        
        for(i=0;i<row;i++) {
        	for(j=0;j<col;j++) {
        		 System.out.print(arr[i][j]+"-");
        	}
        	System.out.println();
        }
        	System.out.println("\n\n");
        for(i=0;i<col;i++) {
        	for(j=0;j<row;j++) {
        		 if(!Character.isWhitespace(arr[j][i])) {
        			 t=t+arr[j][i];
        		 }
        	}t=t+" ";
        	
        }
        t=t.trim();
        System.out.println(t);
         
	}
	

}
