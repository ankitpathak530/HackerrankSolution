package programming.Ankit;
public class KaprikarNumberHackerrank{
public static void main(String[] args) {
	kaprekarNumbers(1,99999);
}

static void kaprekarNumbers(long p, long q) {
    boolean flag=false;
    long tsum,temp;
      for(long i=p;i<=q;i++){
         tsum=0;
         temp=(i*i);
         
         long count = 1;
         long gtemp=i;
          while (gtemp != 0) {
              gtemp = gtemp / 10;  count*=10;
          }

         while(temp>0){
             tsum= tsum + temp%count; temp/=count;
         }
         if(tsum==i){  System.out.print(i+" "); flag=true; }
      }
      if(!flag)
         System.out.println("INVALID RANGE");
                     
 }
}