/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
 public int  getTotalX(int[] a,int[] b)
    {
        int count=0;
        int ax=1;
      
        
        
        for(int i=0;i<a.length;i++)
            ax=lcm(ax,a[i]);
        
        int  bx=b[0];
        for(int i=1;i<b.length;i++)
            bx=gcd(bx,b[i]);
      if(ax>bx)
          return 0;
        for(int i=ax;i<=bx;i++)
           { 
               if(bx%i==0)
                  count++;
           }       
     return count;
    }
   public static int lcm(int x,int y)
   {
       return(x*y)/gcd(x,y);
   }
   public static int gcd(int x,int y)
   {
       if(y!=0)
           return gcd(y,x%y);
        else
           return x;
   }
    
    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

}

public class BetweenTwoSets_HackerRank {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st size ");
           int n1=sc.nextInt();
        int ar[]=new int[n1];
        System.out.println("Enter 2nd size ");
           int n2=sc.nextInt();
        int br[]=new int[n2];
        
        System.out.println("Enter value for ar ");
        for (int i=0;i<n1;i++)
             ar[i]=sc.nextInt();
        System.out.println("Enter value for br ");
        
        for (int i=0;i<n2;i++)
            br[i]=sc.nextInt();

        Result rs=new Result();
        int total = rs.getTotalX(ar, br);
        
         System.out.println(total);
        
    }
}
