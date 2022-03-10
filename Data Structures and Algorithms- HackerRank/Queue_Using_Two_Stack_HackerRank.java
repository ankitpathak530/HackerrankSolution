package com.ds.Ankit_Pathak;

import java.util.Scanner;
import java.util.Stack;

public class Queue_Using_Two_Stack_HackerRank {


    public static void main(String[] args) 
    {
      
        Scanner in = new Scanner(System.in);
        int noElements = in.nextInt();
        
        Stack<Integer> one = new Stack<Integer>();
        Stack<Integer> two = new Stack<Integer>();
        
        int command;
        
        for (int i = 0 ; i < noElements ; i++) {
            command = in.nextInt();
            
            if (command == 1)
                one.push(in.nextInt());
            else if (command == 2)
            {
                if(two.isEmpty())
                {
                    while(!one.isEmpty())
                    {
                        two.push(one.pop());
                    }                    
                }
                
                if (!two.isEmpty()){                                
                    two.pop(); 
                }

            }
            else if (command == 3)
            {       
                if(two.isEmpty())
                {
                    while(!one.isEmpty())
                    {
                        two.push(one.pop());
                    }
                    System.out.println(two.peek());
                } 
                else 
                {
                    System.out.println(two.peek());
                }
            }
        }
             
    }//Main method close
}//class close
