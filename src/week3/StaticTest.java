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
		add(4,3);  //ayn� s�n�f i�inde statik methoda herhangi bir �ey belirtmeden �a��rabiliriz
					// multiply a ula�mak i�in ise ayn� s�n�fta olsa dahi nesne olu�turmak laz�m
	}
	
}
