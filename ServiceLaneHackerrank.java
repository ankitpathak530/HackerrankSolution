import java.util.ArrayList;
import java.util.List;

public class ServiceLaneHackerrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //call service method with n,width of road,cases
	}
   
	 public static List<Integer> serviceLane(int n,List<Integer> width, List<List<Integer>> cases) {
		  
		    List<Integer> result = new ArrayList<Integer>();
		    
		       for(List<Integer> k:cases){
		               
		            int s = k.get(0);
		            int e = k.get(1);
		            
		            int min = width.subList(s,e+1)
		                    .stream()
		                    .min((x,y)->x.compareTo(y))
		                    .get();
		            result.add(min);
		       }
		       return result;   
		    }
	 
	 
		}
   
   

