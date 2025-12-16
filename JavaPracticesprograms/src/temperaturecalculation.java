import java.util.Scanner;
public class temperaturecalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius:");
		double cels= sc.nextDouble();
		double fahren = cels*9/5 + 32;
		System.out.println(" Now This is the temperature in Fahrenheit : "+fahren);
		sc.close();
	}

}
