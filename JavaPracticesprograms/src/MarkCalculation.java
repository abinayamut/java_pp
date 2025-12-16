import java.util.Scanner;
public class MarkCalculation {

	public static void main(String[] args) {
		Scanner sc = new  Scanner (System.in);
		System.out.println("Enter your tamil mark ::");
		float Tamil = sc.nextFloat();
		System.out.println("Enter your English mark ::");
		float eng = sc.nextFloat();
		System.out.println("Enter your Maths mark ::");
		float math = sc.nextFloat();
		System.out.println("Enter your science mark ::");
		float sci = sc.nextFloat();
		System.out.println("Enter your Social mark ::");
		float soc= sc.nextFloat();
		//calculate 
		float Avg = (Tamil+eng+math+sci+soc)/5.0f;
		System.out.println("This is your Avg Mark :"+Avg);
		float total = Tamil+eng+math+sci+soc;
		System.out.println("This is your Toatal Mark::"+total);
		sc.close();
		

	}

}
