package HackerRank;

import java.util.ArrayList;

public class BigSorting {
    public static void main(String... args){
        String s[] = {"12","300","14534543526768546566787","98"};
        
        ArrayList<Long> al = new ArrayList<Long>();
        for(String ss:s){
            long val=Long.parseLong(ss);
            System.out.println(val);
        }        
    }
}
