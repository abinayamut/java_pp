import java.util.Scanner;
public class SmartBalanceChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your balance :");
		double bal = sc.nextDouble();
		if ((bal>=1) && (bal < 1000))
		{
			System.out.println("Alert! Your balance is low.");
		}
		else if (bal >= 1000)
		{
			System.out.println("Your balance is Sufficient. ");
		}
		else if(bal == 0)
		{
			System.out.println("Zero balance.");
		}
		else if(bal < 0)
		{
			System.out.println("Error invalid balance.");
		}
		else
		{
			System.out.println("Error: Please enter a valid number.");
		}
		sc.close();
	}

}
