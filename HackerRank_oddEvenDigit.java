/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author ankitpathak530
 */
public class HackerRank_oddEvenDigit {
    public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
         String s1[]=new String[N];
         for(int i=0;i<N;i++)
         {
             s1[i]=sc.next();
         }
          int j=0;
         while(j<N)
         {  String ev=" ";
            String od=" ";
             for(int i=0;i<s1[j].length();i++)
             {
                if(i%2==0)
                {
                    ev=ev+s1[j].charAt(i);
                }
                else
                {
                    od=od+s1[j].charAt(i);
                }
             }
             j++;
             System.out.println(ev+" "+od);
            
         }
            
      }
 }
