package HackerRank;

import java.util.ArrayList;

public class BigSorting {
    public static void main(String... args){
        String s[] = {"12","300","14534543526768546566787","98"};
        
        List<String> input = Arrays.asList(s);
        input.sort(Comparator.comparing(a -> new BigInteger(a)));
        System.out.println("After Sorting \n"+input);
        
    }
}
