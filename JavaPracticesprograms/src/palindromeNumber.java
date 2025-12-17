import java.util.Scanner;
public class palindromeNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a Number : " );
		int num =  sc.nextInt();
		int original = num;
		int reverse = 0;
		while(num!=0)
		{
			int digit = num%10;
			reverse = reverse*10+digit;
			num = num/10;
		}
		if(original == reverse)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("It is Not a Palindrome Number ");
		}
		sc.close();
	}

}
