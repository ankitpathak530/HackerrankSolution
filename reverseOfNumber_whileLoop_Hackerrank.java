/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

/**
 *
 * @author ankitpathak530
 */
public class reverseOfNumber_whileLoop {
    public static void main(String args[])
    {
       long num=1234567891,rev=0,digit;
        while(num>0)
        {
            digit=num%10;
            rev=(rev*10)+digit;
            num/=10;
        }
        System.out.println(rev);
    }
}
