import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal :");
		float p =sc.nextFloat();
		System.out.println("Enter rate :");
		float r =sc.nextFloat();
		System.out.println("Enter Time :");
		float t =sc.nextFloat();
		float si = (p*r*t)/100;
		System.out.println("Enter Simple Interest : "+si);
	}

}
