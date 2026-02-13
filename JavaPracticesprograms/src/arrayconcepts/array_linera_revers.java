package arrayconcepts;

public class array_linera_revers {


	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		
		System.out.println("Linear Revers:");
		for(int i = n - 1; i >= 0; i--)
		{
			System.out.print(arr[i]+ "");
		}
		System.out.println();

	}

}
