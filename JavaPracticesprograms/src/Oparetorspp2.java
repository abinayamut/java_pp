import java.util.Scanner;
public class Oparetorspp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ::");
		int a = sc.nextInt();
		System.out.println("Enter your Salary ::");
		int b = sc.nextInt();
		if((a>=18)&&(b>=25000))
		{
			System.out.print("You are eligible");
		}
		else
		{
			System.out.println("You are not eligible");
		}
	}

}
