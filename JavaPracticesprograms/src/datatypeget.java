import java.util.Scanner;
public class datatypeget {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your reg number: ");
		long Id = sc.nextLong();
		
		System.out.println("Enter your CGPA : ");
		float Mper = sc.nextFloat();
		
		System.out.println("Enter your Initial: ");
		char init = sc.next().charAt(0);
		sc.nextLine(); // for buffer error nambha ipoo primitive data typela erundhu vera non primitive data typeku input vaangurapo indha maary kudukkanumm 
		System.out.println("Enter your Name : ");
		String name = sc.nextLine();
		
		System.out.println("Hey "+init+" "+name);
		System.out.println("This is your Id : "+Id);
		System.out.println("This is your CGPA "+Mper);
		sc.close();
	}
}
