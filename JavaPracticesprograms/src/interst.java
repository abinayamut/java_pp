import java.util.Scanner;
public class interst {
	float prin;
	float rate;
	int time;
	float si;
 void simpleinterest()
 {
	 si = (prin*rate*time/100);
	 System.out.println(si);
 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		interst in = new interst();
		 System.out.println("Enter the principal : ");
		 in.prin =sc.nextFloat();
		 System.out.println("Enter the rate : ");
		 in.rate = sc.nextFloat();
		 System.out.println("Enter the time : ");
		 in.time = sc.nextInt();
		  in.simpleinterest();
		  sc.close();
	}

}
