/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;
   import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author Ankit
 */
class BreakTheRecordHackerRank
{


    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
         int lst,hst,lcount=0,hcount=0;
          lst=scores[0];
          hst=scores[0];
        for(int i=1;i<scores.length;i++)
        {
            if(scores[i]<lst)
            {
                lst=scores[i];
                lcount++;
            }
            if(scores[i]>hst)
            {
               hst=scores[i];
               hcount++;
            }  
        }       
       int[] ar={hcount,lcount};
       return ar;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
