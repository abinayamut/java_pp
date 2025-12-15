import java.util.Scanner;
public class FruitCostCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Accept the quantities
		System.out.println("Enter the quantity of the fruit 1::");
		int apple = sc.nextInt();
		System.out.println("Enter the quantity of the fruit 2::");
		int banana = sc.nextInt();
		System.out.println("Enter the quantity of the fruit 3::");
		int oranges = sc.nextInt();
		//Accept the Cost
		System.out.println("Enter the cost of the fruit1::");
		double costofapple = sc.nextDouble();
		System.out.println("Enter the cost of the fruit2::");
		double costofbanana = sc.nextDouble();
		System.out.println("Enter the cost of the fruit3::");
		double costoforanges = sc.nextDouble();
		//Calculate total cost.
		double tolcost = (apple*costofapple)+(banana*costofbanana)+(oranges*costoforanges);
		//print result
		System.out.println("Total cost of fruits = "+tolcost);
		sc.close();

	}

}
