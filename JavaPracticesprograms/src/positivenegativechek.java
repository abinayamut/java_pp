import java.util.Scanner;
public class positivenegativechek 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you wnat to chek:");
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("This is positive number");
		}
		else if(num<0)
		{
			System.out.println("This is Negative number");
		}
		else
		{
			System.out.println("Your num is 0");
		}
		sc.close();
	}
}