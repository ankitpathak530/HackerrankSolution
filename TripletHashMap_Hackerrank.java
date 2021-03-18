package programming.Ankit;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class TripletHashMap {
	public static void main(String[] args) {
	 ArrayList<Long> arr = new ArrayList<Long>();
     arr.add(1l);
     arr.add(3l);
     arr.add(9l);
     arr.add(9l);
     arr.add(27l);
     arr.add(81l);
     
     Map<Long,Long> hashmap = new HashMap<Long,Long>();
     long r=3l;
     for(long i:arr){
         Long k=getValue(i,r);
         hashmap.put(r,k);
         System.out.println(k);
     } 
     for(Map.Entry<Long,Long> entry:hashmap.entrySet()){
           System.out.println(entry.getKey()+"----"+entry.getValue());     
     }    
  }
  public static Long getValue(long i,long n){
      long k=0;
      while(i!=1){
          i/=n;k++;
      }
    return k;
  }
}
