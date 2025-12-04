import java.util.Scanner;
public class FindMaximumof3number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1 :");
		int a = sc.nextInt();
		System.out.println("Enter the number 2 :");
		int b = sc.nextInt();
		System.out.println("Enter the number 3 :");
		int c = sc.nextInt();
		int max;
		if(a>b && a>c)
		{
			max = a;
		}
		else if(b>a && b>c)
		{
			max = b;
		}
		else
		{
			max = c;
		}
		System.out.println("Largest = "+max);
	}

}
