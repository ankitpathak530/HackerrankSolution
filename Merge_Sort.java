package GeeksForGeeks.Datastructure;

public class Merge_Sort {

	public static void main(String[] args) {
		
		int ar[] =  {54,23,12,76,23};
		mergeSort(ar,0,4);
		for(int i:ar)
			System.out.println(i);
		
	}
	
	public static void mergeSort(int ar[],int lower,int upper)
	{
		int mid = 0;
		
		 if(lower < upper)
		 {
			 mid = (lower + upper)/2;
			 
			 mergeSort(ar,lower,mid);
			 mergeSort(ar,mid+1,upper);
			 merge(ar,lower,mid,upper);
		 }
	}
  
	public static void merge(int ar[],int lower,int mid,int upper)
	{
	      int temp[] = new int[upper-lower +1];
	      int i = lower;
	      int j = mid+1;
	      int k = 0;
	      
	      while(i <= mid && j <= upper)
	      {           
	    	   if(ar[i] <= ar[j])
	    		   temp[k++] = ar[i++];
	    	   else
	    		   temp[k++] = ar[j++];  
	      }
	      
	      while(i <= mid)
	      {
	    	  temp[k++] = ar[i++];
	      }
	      while(j <= upper)
	      {
	    	  temp[k++] = ar[j++];
	      }
	      
	      for(i = lower; i <= upper; i++)
	      {
	    	  ar[i] = temp[i-lower];
	      }
	}
	
	
	
	
}
