package week3;
import java.util.Scanner;
public class regissss {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Kayýt olmak için 1'i tuþlarýn.");
		System.out.println("Giriþ yapmak için 2'i tuþlarýn.");
		
		int s=scan.nextInt();
		scan.nextLine();
		
		String ID1="";
		String Pass1="";
		String ID=null;
		String Pass=null;
		String ID2="";
		String Pass2="";
		
		
		if (s==1) {
			
			System.out.print("ID: ");
			
			
			ID1=scan.nextLine();
			System.out.println();
			System.out.print("Password: ");
			
			Pass1=scan.nextLine();
			System.out.println();
			System.out.println("Kullanýcý oluþturuldu");
			
			System.out.print("ID: ");
			
			ID=scan.nextLine();
			System.out.println();
			System.out.print("Password: ");
			
			Pass=scan.nextLine();
			System.out.println();
				if(ID.equals(ID1)) {
					if(Pass.equals(Pass1)) {
					System.out.println("Giriþ baþarýlý");
				}
					else {
						System.out.println("Giriþ baþarýsýz.");
					}
				}
				else {
					System.out.println("Kullanýcý adý veya þifre yanlýþ!");
				}
		}
		else if(s==2) {
			System.out.print("ID: ");
			
			ID2=scan.nextLine();
			System.out.println();
			System.out.print("Password: ");
			
			Pass2=scan.nextLine();
				if(ID2.equals(ID) && Pass2.equals(Pass)){
				
				}
				else {
					System.out.println("Kullanýcý tanýmlý deðil.Lütfen kaydolunuz.");
				
					System.out.print("ID: ");
					
					ID1=scan.nextLine();
					System.out.println();
					System.out.print("Password: ");
					
					Pass1=scan.nextLine();
					System.out.println();
					System.out.println("Kullanýcý oluþturuldu");
				
					System.out.print("ID: ");
					
					ID2=scan.nextLine();
					System.out.println();
					System.out.print("Password: ");
					
					Pass2=scan.nextLine();
					
					if(ID2.equals(ID1) && Pass2.equals(Pass1)) {
						System.out.println("Giriþ baþarýlý");
					}
					else {
						System.out.println("Kullanýcý adý veya þifre yanlýþ!");
					}
			}	
			
		}
		else {
			System.out.println("Eksik ya da yanlýþ tuþlama yaptýnýz.");
		}
		
			}
			
		
		

	}

