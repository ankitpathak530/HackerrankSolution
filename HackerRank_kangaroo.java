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
public class HackerRank_kangaroo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x1,x2,v1,v2;
        System.out.println("Enter X1 V1 X2 V2 ");
        x1=sc.nextInt();
        v1=sc.nextInt();
        x2=sc.nextInt();
        v2=sc.nextInt();
        System.out.println("last input lsines");
        
    }
    public static boolean kangaroo(int x1,int v1,int x2,int v2)
    {   
        if(x1==x2 && (v1<v2 || v2<v1))
        {
           return false;
        }
        int y=x1+v1;
        int z=x2+v2;
        int i=0;
        while(i<100)
        {
            if(y==z)
            {
                return true;
               
            }
            y=y+v1;
            z=z+v1;
        }
        return false;
        
    }

}

