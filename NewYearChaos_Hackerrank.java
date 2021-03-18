package HackerRank;

public class NewYearChaos {
	 public static void main(String[] args) {
		 minimumBribes(new int[]{2,1,5,3,4});// 2,1,5,3,4  2 1 4 3 5  2 1 3 4 5
	 }										  //0 1 2 3 4  0 1 2 3 4  0 1 2 3 4
	static void minimumBribes(int[] arr) {
		int n=arr.length;
		int count=0,swap=0;
		boolean flag=true;
		for(int i=n-1;i>=1;i--){ 
		       if(arr[i]==i+1)
		         continue;
		       else if(arr[i-1]==i+1)
		       {
		          swap++;
		          arr[i-1]=arr[i];
		       }
		       else if(arr[i-2]==i+1)
		       {
		           swap+=2;
		          arr[i-2]=arr[i-1];
		          arr[i-1]=arr[i];
		       }
		       else {
		          flag=false;break;}
		       
		     }
		if(flag)
		System.out.println(swap);
		else
			 System.out.println("To Chaotic "+ swap);
		}
	
	}

