package HackerRank;

public class StrongPassword {
	public static void main(String... args) {
		String password="Ab1";
		int n=3;
		int capital=0,small=0,number=0,symbol=0;
        for(int i=0;i<n;i++){
            if(password.charAt(i)>=65 && password.charAt(i)<=90)
              capital=1;
            else if(password.charAt(i)>=97 && password.charAt(i)<=122)
            	small=1;
            else if(password.charAt(i)>=48 && password.charAt(i)<=57)
            	number=1;
            else
            	 symbol=1;
          }
        int result=capital+small+number+symbol;
        result=4-result;
        
        if((n+result)<6)
            System.out.println(result+(6-(n+result)));
         else
             System.out.println(result);
        }
            

	}

