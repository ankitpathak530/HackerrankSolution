package HackerRank;
import java.util.HashMap;
import java.util.Map;

public class GameOfThrones {

	public static void main(String[] args) {
		String s="cdcdcdcdeeeef";
		
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
        for(char ch:s.toCharArray()) {
        	if(mp.containsKey(ch)) {
        		int val=mp.get(ch);
        		mp.put(ch,++val);
        	}
        	else
        		mp.put(ch,1);
         }
        int evn=0;
        for(int n:mp.values()) {
        	if(n%2!=0)
        		evn++;
        }
        if(evn>=2)
        	System.out.println("false");
        else
        	System.out.println("true");
        	
	}

}
