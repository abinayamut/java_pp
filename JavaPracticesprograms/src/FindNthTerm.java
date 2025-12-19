import java.util.Scanner;
public class FindNthTerm {

	public static void main(String[] args) {
		int[] arr = {0,0,7,14,12,21,18,28};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nth Term to see: ");
		int n = sc.nextInt();
		System.out.println(arr[n]);
		
sc.close();
	}

}
