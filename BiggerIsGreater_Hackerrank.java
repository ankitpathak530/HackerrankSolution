
public class BiggerIsGreater_Hackerrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //call biggerIsGreater method of Result class by passing string
	}

}
class Result {
    
    public static String biggerIsGreater(String w) {
        
    //Write your code here
   
    char ch[] = w.toCharArray();
    int l = ch.length;
    
         
    boolean found = false;
    int pivotIndex = -1;
    
    for(int i=l-1;i>0;i--){
        if(ch[i] <= ch[i-1])  continue;
        
        System.out.println(ch[i-1] + "  "+ch[i]);
        found=true;
        pivotIndex = i-1;
        break;        
    }
    
    
    if(!found)
       return "no answer";
    
    
    int rightmost = 1;
    for(int i = l-1;i>pivotIndex;i--){
        
        if(ch[i] > ch[pivotIndex]){
            rightmost = i;
            break;
        }
    }
    
    //swap pivot index with right index
    char c = ch[pivotIndex];
    ch[pivotIndex] = ch[rightmost];
    ch[rightmost] =  c;
    
    //swap element from pivot <--> right
    int left = pivotIndex+1,right = ch.length - 1;
    while(left < right){
        c = ch[left];
        ch[left] = ch[right];
        ch[right] = c;
        
        left++;
        right--;
    }
    
    return new String(ch); 
}
}
