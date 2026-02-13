package arrayconcepts;

public class Class_Students_Marks_Total_Average {

	public static void main(String[] args) {
		int[] marks = {90,90,90,90,90};
		int sum =0;
		for (int i=0; i < marks.length; i++)
		{
			sum += marks[i];
		}
		double avg =(double)sum/marks.length;
		
		System.out.println("Total Marks :" + sum);
		System.out.println("Average is :"+ avg);
	}

}
