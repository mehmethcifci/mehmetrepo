package week3;

public class StaticExample2 {

	public static void main(String[] args) {
			
		StaticExample obj= new StaticExample();
		//static olmayan de�i�kene eri�tim
		System.out.println(obj.min+1);
		
		//static de�i�kene eri�tim
		System.out.println(StaticExample.max);
		
		
	}

}
