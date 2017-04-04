import java.io.File;
import java.util.*;


public class ClosestYard 
{
	public static void main(String[] args) 
	  {
		Scanner scan = new Scanner(System.in);
	    System.out.println(" location latitude: ");
	    int lat = scan.nextInt();
	    System.out.println(" location longitude: ");
	    int longt = scan.nextInt();
		try {
		      File file = new File("zip_code_states.csv");
		      Scanner sc = new Scanner(file);
		      while(sc.hasNextLine()) 
		      { int i,j = 0;
		        String str = sc.nextLine();
		        String[] array = str.split(",");
		        int latitude [i] = (ConvertStringtoInteger.mystoi(array[1]));
		        i++;
			    int longitude [j] = (ConvertStringtoInteger.mystoi(array[2]));
			    j++;
			   }
		     }
		catch(Exception e) 
	    {
	      e.printStackTrace();
	    }
		int distance = Integer.MAX_VALUE;
	      for(int k = 0 ; k< latitude.length; k = k+1) 
	      {
	        distance = Min(distance, (latitude[k]-lat)^2+(longitude[k]-longt)^2);
	      }
	      System.out.println ("The closest location is "+ distance);
	  }
}
