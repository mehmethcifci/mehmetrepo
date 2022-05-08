package week3;

public class Calculator {

	public static void main(String[] args) {
		
		int sum= sum(7,8);
		int diff=diff(20,9);
		int multi=multiply(7,6);
		double divide=divide(4,3);
		int mod=mod(7,3);
		
		System.out.println("Toplama= " + sum);
		System.out.println("Çýkarma= " + diff);
		System.out.println("Çarpma= " + multi);
		System.out.println("Bölme= " + divide);
		System.out.println("Kalan= " + mod);
		

	}
	public static int sum(int a, int b) {
		
		return a+b;
	}
	public static int diff(int a, int b) {
		
		return a-b;
}
	public static int multiply(int a, int b) {
	
		return a*b;
}
	public static double divide(double a, double b) {
	
		return a/b;
}
	public static int mod(int a, int b) {
		
		return a%b;
}
}