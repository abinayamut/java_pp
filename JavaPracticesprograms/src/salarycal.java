import java.util.Scanner;
public class salarycal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//accept a decimal(salary)
		System.out.println("Enter your salary::");
		double salary = sc.nextDouble();
		//CALCULATE
		double Allowance = salary*(10.0/100);
		double bonus = salary *(5.0/100);
		double TotalSalary = salary+Allowance+bonus;
		//print
		System.out.println("This is your Salary : "+salary);
		System.out.println("This is your Allowance : "+Allowance);
		System.out.println("This is your Bonus :"+bonus);
		System.out.println("This is your Total Salary : "+TotalSalary);
		sc.close();

	}

}
