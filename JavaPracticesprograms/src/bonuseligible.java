import java.util.Scanner;
public class bonuseligible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int experience = sc.nextInt();
		 if((salary >= 30000)&&(experience>=3))
		 {
			 System.out.println("Your Eligibile for salary Bonus");
		 }
		 else
		 {
			 System.out.println("Your not Eligibile for salary Bonus ");
		 }
		 sc.close();
	}
}
