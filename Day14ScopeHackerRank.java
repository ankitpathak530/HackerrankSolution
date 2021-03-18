package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
	// Add your code here
    Difference(int a[])
    {
        this.elements=a;
    }
    
    public void computeDifference()
    {
       int i;
        for(i=0;i<elements.length-1;i++)
        {
            for(int j=0;j<elements.length-i-1;j++)
              {
                  if(elements[j]>elements[j+1])
                   {
                       int temp=elements[j];
                       elements[j]=elements[j+1];
                       elements[j+1]=temp;
                   }
              }
             System.out.println("mike check");
        }
        maximumDifference=elements[i]-elements[0];
    }
} // End of Difference class

public class Day14ScopeHackerRank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}