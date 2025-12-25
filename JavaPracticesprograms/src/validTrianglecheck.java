import java.util.Scanner;
public class validTrianglecheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The first side length :");
		int a = sc.nextInt();
		System.out.print("Enter The 2nd side length :");
		int b = sc.nextInt();
		System.out.print("Enter The 3rd side length :");
		int c = sc.nextInt();
		if((a+b>c)&&(a+c>b)&&(b+c>a))
		{
			System.out.println("Your Triangle is valid ");
		}
		else
		{
			System.out.println("Your Triangle is Invalid ");
		}
		sc.close();
		}

	}
