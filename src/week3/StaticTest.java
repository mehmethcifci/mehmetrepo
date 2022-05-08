package week3;

public class StaticTest {

	
	//non static method
	int multiply(int a, int b) {
		return a*b;
	}
	
	//static method
	public static int add(int a, int b) {
		
		return a+b;
	}
	
	public static void main(String[] args) {
		add(4,3);  //ayný sýnýf içinde statik methoda herhangi bir þey belirtmeden çaðýrabiliriz
					// multiply a ulaþmak için ise ayný sýnýfta olsa dahi nesne oluþturmak lazým
	}
	
}
