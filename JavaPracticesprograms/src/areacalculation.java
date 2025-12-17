import java.util.Scanner;
public class areacalculation {

	public static void main(String[] args) {
		//accept the length and width
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of the area : ");
		int length = sc.nextInt();
		System.out.println("Enter the width of the area : ");
		int width = sc.nextInt();
		//process
		int Area = length * width;
		System.out.println("This is the total area of rectangle : "+Area);
 sc.close();
	}
	
	
}
