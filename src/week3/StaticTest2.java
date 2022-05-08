package week3;

public class StaticTest2 {

	public static void main(String[] args) {
		
		StaticTest test = new StaticTest();
		
		System.out.println(test.multiply(5, 6));
		
		System.out.println(StaticTest.add(5, 6));
	}

}
