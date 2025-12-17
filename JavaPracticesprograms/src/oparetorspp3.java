import java.util.Scanner;
public class oparetorspp3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number ::");
		int a = sc.nextInt();
		System.out.println("Enter tyhe 2nd NUmber ::");
		int b = sc.nextInt();
		System.out.println("Enter the Oparetion (+,-,*,/) ::");
		char op = sc.next().charAt(0);
		int result;
		switch(op)
		{
		case'+':
			result = a+b;
			System.out.println("Result = "+result);
			break;
		case'-':
			result = a-b;
			System.out.println("Result = "+result);
			break;
		case'*':
			result = a*b;
			System.out.println("Result = "+result);
			break;
		case'/':
			result = a/b;
			System.out.println("Result = "+result);
			break;
		default:
			System.out.println("Invalid number");
		}
		sc.close();

	}

}
