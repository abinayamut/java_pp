import java.util.Scanner;
public class RectangleArea {
	int len;
	int bre;
	int areas;
	void area(){
		areas =len*bre;	
		System.out.println(areas);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 RectangleArea r1 = new RectangleArea();
		 System.out.println("Enter the length of the Rectangle: ");
		 r1.len = sc.nextInt(); 
		 System.out.println("Enter the breath of the Rectangle: ");
		 r1.bre = sc.nextInt();
		 
		 r1.area();
		 sc.close();
	}

}
