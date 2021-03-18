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
public class Binary_Numbers_hackerrank {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int number;
        int one_s;
        int flag=0;
        System.out.println("Enter number to convert binary form");
        number=sc.nextInt();
        while(number>1)
        {   flag++;
            one_s=number/2;
            number=one_s;
            if(number==3)
            {
                flag+=1;
            }
            
        }
        flag-=1;
        System.out.println(flag);
    }
}
