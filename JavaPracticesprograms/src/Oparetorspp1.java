import java.util.Scanner;
public class Oparetorspp1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give your number to check ::");
		int a = sc.nextInt();
		if(a % 2 == 0)
		{
			System.out.println("This number is even");
		}
		else
		{
			System.out.println("This number is odd");
		}
		sc.close();
	}
}
