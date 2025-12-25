import java.util.Scanner;
public class NumberSignDivisibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check ::");
		int num = sc.nextInt();
		if(num > 0)
		{
			
		   if((num >0)&&(num%3==0)&&(num%5==0))
			{
				System.out.println("Your number is positive and divisible by 3 and 5 ");
			}
		   else 
		   {
			   System.out.println("Your number is postive  and not divisible by 3 and 5");
		   }
		}
		else if (num<0) {
			System.out.println("Your number is Negative");
		}
		else
		{
			System.out.println("Your number is Invalid (it is zero) plzz enter valid number ");
		}
		sc.close();
	}

}
