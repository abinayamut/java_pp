import java.util.Scanner;
public class datatypeget {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your reg number: ");
		int Id = sc.nextInt();
		
		System.out.println("Enter your CGPA : ");
		float Mper = sc.nextFloat();
		
		System.out.println("Enter your Initial: ");
		char init = sc.next().charAt(0);
		
		System.out.println("Enter your Name : ");
		String name = sc.next();
		
		
		
		System.out.println("Hey "+init+" "+name);
		//System.out.println(name);
		System.out.println("This is your Id : "+Id);
		System.out.println("This is your CGPA "+Mper);
		sc.close();
	}


}
