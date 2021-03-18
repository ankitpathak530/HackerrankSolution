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
public class DayProgrammer_HackerRank{

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year)
     {
        int y = 243,pday=256,tday;
          
     if(year%400==0 || year%4==0)
        y=244;
     else
        {
            if(year%100!=0)
                y=243;
        }
       
         tday=pday-y;
         String s=tday+".09."+year;
        return s;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter uyear :");
        int year=sc.nextInt();
        String result = dayOfProgrammer(year);
        
        System.out.println(result);
      
    }
}
