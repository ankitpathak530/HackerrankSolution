package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

  
public class PeekingNumbers {
    public static void main(String[] args) {
       
       List<Integer> l = new ArrayList<Integer>();
       l.add(1);
       l.add(5);
       l.add(2);
       l.add(2);
       l.add(4);
       l.add(4);
       l.add(5);
       l.add(5);
       l.add(5);
        int result = pickingNumbers(l);
        System.out.println("\n"+result+ " in main method ");
    }
   public static int pickingNumbers(List<Integer> ar) {
        // Write your code here
          int frequency[] = new int[101];
          int result = Integer.MIN_VALUE;
          System.out.println(result);
          for(int i=0;i<ar.size();i++){
              int indexes = ar.get(i);
              int nn=frequency[indexes]++;
             System.out.print(" , "+nn);
          }
          System.out.println();
          for(int i=0;i<=15;i++)
        	  System.out.print(frequency[i]+" ' ");
          for(int i=1;i<100;i++){
             result = Math.max(result,frequency[i]+frequency[i-1]);
          }
          return result;
        }
}
