package programming.Ankit;
import java.util.Scanner;
public class SumUntillSingleDigit {
     public static void main(String[] args) {
    	 Scanner sc  = new Scanner(System.in);
         System.out.println("Enter number:");
         long n = sc.nextInt();
         long sum=0,temp;
         while(n>=9) {
        	 sum=0;temp=n;
        	 while(temp>0) {
        		 sum+=temp%10;
        		 temp/=10;
        	 }
        	 n=sum;
         }
         System.out.println(sum);
     }
}