package week3;

public class Example2 {

	public static void main(String[] args) {
		
		System.out.println(toplam(9,3));
		
		
	}
	public static int toplam(int a, int b) {
		int toplam1=0;
		if(a>b) {
		for (int i=b; i<=a; i++) {
			
			toplam1 +=i;		
		}
		System.out.println(b);
		return toplam1;
		}
		else {
			for (int i=a; i<=b; i++) {
			toplam1 +=i;	
		}
			System.out.println(a);
			return toplam1;
		}
		
		}	
	}


		/*
		 * public static int (int start, int end)
		 * 
		 * if(end>start) {
		int a = end + sum(start, end-1);
		return a;
		}
		else{
		return end;
		}

*
*/

