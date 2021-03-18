package programming.Ankit;

public class ACM_IPC_HackerRank {
   public static void main(String[] args) {
	   //just call function
   }

static int[] acmTeam(String[] topic) {
    int data[]=new int[2];
    data[0]=0;
    data[1]=1;
    int count=0,t,i,j,n=topic.length,k=topic[0].length();

    for(i=0;i<n-1;i++){
        for(j=i+1;j<n;j++){
            count=0;t=0;
            while(t!=k){
                if(topic[i].charAt(t)=='1' || topic[j].charAt(t)=='1')
                    count++;
                t++;
              }
           if(count==data[0])
                   data[1]++;
           else if(count>data[0]){
               data[0]=count;
               data[1]=1;
           }
           
        }
    }
return data;
 }
}