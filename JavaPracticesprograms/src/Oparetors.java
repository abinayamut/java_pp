import java.util.Scanner;
public class Oparetors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number :: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Number :: ");
		int b = sc.nextInt();
		int sum = a+b;
		int difference = a-b;
		int product = a*b;
		int quotient = a/b;
		System.out.println("Sum of the two number is "+sum);
		System.out.println("difference of the two number is "+difference);
		System.out.println("product of the two number is "+product);
		System.out.println("Quotient of the two number is "+quotient);
		sc.close();
	}

}
