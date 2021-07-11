package HackerRank;

import java.util.ArrayList;

public class BigSorting {
    public static void main(String... args){
        String s[] = {"12","300","14534543526768546566787","98"};
        //1st Approach  4 test case pass
        /*
        List<String> input = Arrays.asList(s);
        input.sort(Comparator.comparing(a -> new BigInteger(a)));
        System.out.println("After Sorting \n"+input);
        
        
        //2nd Approach  6 Test cases pass
        Collections.sort(input,new Comparator<String>() {
        @Override
           public int compare(String a, String b) {
            // TODO Auto-generated method stub
            if(a.length()>b.length())
                return 1;
              else if(a.length()<b.length())
                return -1;
              else if(Long.parseLong(a)>Long.parseLong(b))
                 return 1;
              else if(Long.parseLong(a)<Long.parseLong(b))
                 return -1;
              else
                  return 0;
        }});
        */
         Collections.sort(input,new Comparator<String>() {
        @Override
           public int compare(String a, String b) {
            // TODO Auto-generated method stub
              if(a.length()>b.length())
                  return 1;
              else if(a.length()<b.length())
                  return -1;
              else
                {
                   BigInteger b1 = new BigInteger(a);
                   BigInteger b2 = new BigInteger(b);
                   
                  return b1.compareTo(b2);
                }               
        }});
        return input;
        
        
    }
}
