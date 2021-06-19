
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CircularArrayRotation {

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
  
      int start,i,length = a.size();
         
      ArrayList<Integer> rs = new ArrayList<Integer>();
      ArrayList<Integer> bs = new ArrayList<Integer>();
    
    
      if(k>length)
           start = (k%length==0)?0:length-(k%length);
      else if(k==0 || k==length)
           start = 0;
      else
          start = length-k;
        
      i=start;
      do{
          rs.add(a.get(i));
          i++;
          if(i==length) i=0;
          
      }while(i!=start);
        
       for(i=0;i<queries.size();i++)
            bs.add(rs.get(queries.get(i)));
           
       return bs;
    }

}