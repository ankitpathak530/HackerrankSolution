package GeeksForGeeks.Datastructure;

public class QuickSort {

	public static void main(String[] args) {
	  
		 int ar[] = {34,12,43,1,32,55,3};
		 quick_sort(ar,0,6);
		 
		 for(int i:ar)
			 System.out.println(i);
	}
	public static void quick_sort(int ar[],int lower,int higher)
	{
		   if(lower < higher)
		   {
			   int j = partition(ar,lower,higher);
			   quick_sort(ar,lower,j-1);
			   quick_sort(ar,j+1,higher);
		   }
	}
	public static int partition(int ar[],int lower,int higher)
	{
		  int pivot = ar[lower];

		  int i = lower+1;
		  int j = higher;
		  
		  int temp;
		  
		  while(i < j)
		  {
			  while(ar[i] < pivot)
				  i++; 
			  while(ar[j] > pivot)
				  j--;
			  
			  if(i < j)
			  {
				  temp = ar[i];
				  ar[i] = ar[j];
				  ar[j] = temp;
			  }
		  }  
		  temp = ar[j];
		  ar[j] = ar[lower];
		  ar[lower] = temp;
		  
	    return j;	  
	}
}
