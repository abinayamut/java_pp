import java.util.Scanner;
public class EmployeeSalaryCalculation {
	int empid;
	String empname;
	long basicsalary;
	double HRA,DA,TS;
 void calculation() {
	 HRA = basicsalary*(20.0/100);
	 DA = basicsalary*(10.0/100);
	 TS = basicsalary+HRA+DA;
	 System.out.println(TS);
 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeSalaryCalculation esc = new EmployeeSalaryCalculation();
		System.out.println("Enter the Employee ID: ");
		esc.empid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Employee Name : ");
		esc.empname = sc.nextLine();
		System.out.println("Enter the Employee Salary : ");
		esc.basicsalary = sc.nextLong();
		esc.calculation();
		sc.close();
	}
}
