package HackerRank;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;


public class GameStone {
    public static void main(String[] args) {
    	
    	 
    }
    public static int gmstn(String []arr) {
    	int count=0,res=0;
    	for(char ch:"abcdefghijklmnopqrstuvwxyz".toCharArray()) {
    		res=0;
    		for(int i=0;i<arr.length;i++) {
    			if(arr[i].indexOf(ch)>-1){
    				res++;
    			}
    		}
    		if(res==arr.length)
    		   count++;
    	}
    	return count;
    }
	
}
