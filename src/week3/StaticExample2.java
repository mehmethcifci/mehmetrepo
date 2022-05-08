package week3;

public class StaticExample2 {

	public static void main(String[] args) {
			
		StaticExample obj= new StaticExample();
		//static olmayan deðiþkene eriþtim
		System.out.println(obj.min+1);
		
		//static deðiþkene eriþtim
		System.out.println(StaticExample.max);
		
		
	}

}
