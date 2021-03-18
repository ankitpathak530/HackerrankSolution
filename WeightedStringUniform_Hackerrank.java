package HackerRank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WeightedStringUniform {
 public static void main(String[]args) {
	 String s="abccddde";
	s=s.toUpperCase();
	 int a[]= {1,3,12,5,9,10};			
	 String result[]= new String[a.length];
	 result=weightedUniformStrings(s,a);
	 
    for(String t:result)
    	System.out.println(t);
	 
   }
  static String[] weightedUniformStrings(String s, int[] queries) {
	  int ql=queries.length;
	  int sl=s.length();
	  int sum=0,j;
	  List<Integer> al = new ArrayList<Integer>();
	  
	 String result[] = new String[ql];
	 
	 for(int i=0;i<sl;i++) {
		 j=i;sum=0;
		 while(s.charAt(i)==s.charAt(j)) {
		     int n=s.charAt(j);
			 sum=sum+n-64;
			 j++;	
			 al.add(sum);
			 if(j==sl)
				 break;
		 }
		 i=j-1;
	  } 
	 j=0;
	 for(int n:queries) {
		 if(al.contains(n))
			 result[j]="Yes";
		 else
			 result[j]="No";
		 j++;
	 }
	 return result;
  }
}

