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

class Result {
    public static int nonDivisibleSubset(int k, List<Integer> ar) {
    // Write your code here
    int frequency[]=new int[k];
    for(int i:ar)
        frequency[i%k]++;//frequency[indexes]=frequency[indexes]+1;

    int count=0;
    if(frequency[0]>1)
       count++;
    for(int i=1;i<k;i++){
        if(frequency[i]==0) continue;      
         if(i+i==k){
            count++;
         }
         else{
              count+=Math.max(frequency[i],frequency[k-i]);
              frequency[i]=0;
              frequency[k-i]=0;
           }
    }
   return count;
    }

}

public class NonDivisibleSubset {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.nonDivisibleSubset(k, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
