package HackerRank;

import java.util.Arrays;

public class ArrayLeftRotation {
	public static void main(String args[])
    {
	  rotLeft(new int[]{1,2,3,4,5,},14);
    }
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
