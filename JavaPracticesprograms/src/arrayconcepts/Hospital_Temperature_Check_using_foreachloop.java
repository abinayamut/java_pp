package arrayconcepts;

public class Hospital_Temperature_Check_using_foreachloop {

	public static void main(String[] args) {
		double[] temp = {99.9,67.0,100.5,122.3,111.4};
		 int fevercount = 0;
		 
		 for (double valuet : temp)
		 {
			 if(valuet >100)
			 {
				 fevercount++;
			 }
		 }
		 System.out.println("Number of fever patient is :"+ fevercount);

	}

}
