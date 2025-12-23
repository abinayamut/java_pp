import java.util.Scanner;
public class evenoddwithfour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		if (var%2 == 0)
		{
			System.out.println("Entered value is even number ");
		}
		else if((var %2 == 0)&&(var %4 ==0))
				{
			System.out.println("Entered value is even number and also divied by 4 ");
				}
		else
		{
			System.out.println("Entered value is odd number ");
		}
		sc.close();
	}

}
