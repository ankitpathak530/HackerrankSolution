package HackerRank;

import java.util.Arrays;

public class ArrayLeftRotation {
	public static void main(String args[])
    {
	  rotLeft(new int[]{1,2,3,4,5,},14);
    }

	//1st Approach by rotating array one time to left
       static List<Integer> rotateLeft(int d, List<Integer> arr) 
       {
	     List<Integer> result = new ArrayList<>();
	     int n = arr.size();

		  if(d > n)
		     d = d % n;

		  int k = d;
		  do{ 
		      if(k == n)
			  k = 0;

		       result.add(arr.get(k++));       
		  }while(k != d);

 	       return result;
       }
	
	//2nd Approach by converting number to String -  NOTE:- It may not work for two digit array data
	static void rotLeft(int[] a, int d) {
		
		if(d%a.length==0)
			System.out.println("same");//return a;
		else {
			d%=a.length;
			System.out.println(d);
			String str="";
			for(int n:a)
				str+=Integer.toString(n);
			str=str.substring(d,str.length())+str.substring(0,d);
		    int k=0;
		    for(char ch:str.toCharArray()) {
		    	a[k]=Integer.parseInt(String.valueOf(ch));k++;}
		}
		
		
    }
}
