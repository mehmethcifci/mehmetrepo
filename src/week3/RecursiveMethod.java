package week3;

public class RecursiveMethod {

	public static void main(String[] args) {
		int fact=factorial(4);
		System.out.println(fact);

	}
	public static int factorial(int n) {
		if (n !=0)
			return n*factorial(n-1);
		else
			return 1;
		
	}

}
