
public class variableclass {
	int a = 10;
	void localvariable()
	{
	int b = 100;
	}
	public static void main(String[] args) {
		variableclass var = new variableclass();
		var.localvariable();
		System.out.println("Global variable :"+var.a);
		
	}

}
