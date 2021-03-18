/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author Ankit
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HackerRankVector {
    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int grtr = -1;
        
        for(int i=0;i<keyboards.length;i++)
        {
            for(int j=0;j<drives.length;j++)
            {
                int sum=keyboards[i]+drives[j];
                if(b>sum && grtr<sum)
                {
                    grtr=sum;
                }
            }
        }
       System.out.println("now grtr is "+grtr);
        return grtr;
    }
    public static void main(String[] args) throws IOException
    {
       Scanner sc = new Scanner(System.in);
        int[] key = new int[20];
        int[] drive = new int[20];
        
        int b =sc.nextInt();
        System.out.println("Enter m & n");
        int m =sc.nextInt();
        int n =sc.nextInt();
        System.out.println("Enter keyboards prize ");
        for(int i=0;i<m;i++)
            key[i]=sc.nextInt();
         System.out.println("Enter drives prize ");
        for(int i=0;i<n;i++)
            drive[i]=sc.nextInt();
        
        int moneySpent = getMoneySpent(key, drive, b);
        System.out.println("money spent "+moneySpent);
       
        
    }
}