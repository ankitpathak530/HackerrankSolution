package programming.Ankit;
import java.util.*;

public class PalindromeAverage{
    public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
       int arr[]=new int[10];
       System.out.println("Enter 10 Integers :");
      
       for(int i=0;i<10;i++)
    	  arr[i]=sc.nextInt();
      
       int i=new Integer(2);
       Integer ii=new Integer(2);
       Integer iii=(double)2;
       Integer i=2;
       Arrays.sort(arr); 
       
      int index=9; 
      while(arr[index]==arr[9])
    	  index--;
      int second_largest=arr[index];
      
      index=0;
      while(arr[0]==arr[index])
    	  index++;
      int second_minimum=arr[index];
      
      System.out.println("Average of Second Minimum and second Largest number is "+(second_largest+second_minimum)/2);
    }
}
     