package HackerRank;

public class SeperateTheNumber {
    public static void main(String[] args) {
    	separateNumbers("010203");
    }
    public static void separateNumbers(String s) {
        String nw="";
        int k=0;
 
       for(int i=1;i<=s.length()/2;i++){
           nw = s.substring(0,i);
           String result="";
           long n=Long.parseLong(nw);
           while(result.length()<s.length()){
               result+=Long.toString(n++);
           }
           if(s.equals(result)) {
               k=1;break;}
       }
       System.out.println(k==1? "YES "+nw : "NO");
    }
      
}

