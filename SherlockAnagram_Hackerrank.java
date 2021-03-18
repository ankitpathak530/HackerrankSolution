package programming.Ankit;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
public class SherlockAnagram {

	public static void main(String[] args) {
	
	}
	int sherlockanagram(String s) {
	HashMap<String, Integer> repo = new HashMap<>();
    int val = 0, temp = 0;
    ArrayList<String> arrStr = new ArrayList<>();

    for(int i = 0; i <= s.length(); i++) {
        for(int j = i; j <= s.length(); j++) {
            String sb1 = s.substring(i, j);
            if(!sb1.equals("")){
                arrStr.add(sb1);
            }
        }
    }

    for(String sb : arrStr) {
           char[] cArr = sb.toCharArray();
           Arrays.sort(cArr);
           sb = new String(cArr);
           if(repo.containsKey(sb)) {
               temp = repo.get(sb);
               val = val + temp;
               temp++;
               repo.put(sb, temp);
           } else {
               repo.put(sb, 1);
           }
    }
    return val;

  }
}