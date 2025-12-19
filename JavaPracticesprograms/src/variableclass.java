
public class variableclass {
	int a = 10;
	public int localvariable()
	{
	int b = 100;
	return b;
	}
	
	static int add() {
		int c = 50;
		return c;
	}
	public static void main(String[] args) {
		variableclass var = new variableclass(); //classname objectname = new classname()
		System.out.println("Global variable :"+var.a);
		int d = var.localvariable();
		System.out.println(d+add());
		
	}

}
