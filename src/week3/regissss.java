package week3;
import java.util.Scanner;
public class regissss {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Kay�t olmak i�in 1'i tu�lar�n.");
		System.out.println("Giri� yapmak i�in 2'i tu�lar�n.");
		
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
			System.out.println("Kullan�c� olu�turuldu");
			
			System.out.print("ID: ");
			
			ID=scan.nextLine();
			System.out.println();
			System.out.print("Password: ");
			
			Pass=scan.nextLine();
			System.out.println();
				if(ID.equals(ID1)) {
					if(Pass.equals(Pass1)) {
					System.out.println("Giri� ba�ar�l�");
				}
					else {
						System.out.println("Giri� ba�ar�s�z.");
					}
				}
				else {
					System.out.println("Kullan�c� ad� veya �ifre yanl��!");
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
					System.out.println("Kullan�c� tan�ml� de�il.L�tfen kaydolunuz.");
				
					System.out.print("ID: ");
					
					ID1=scan.nextLine();
					System.out.println();
					System.out.print("Password: ");
					
					Pass1=scan.nextLine();
					System.out.println();
					System.out.println("Kullan�c� olu�turuldu");
				
					System.out.print("ID: ");
					
					ID2=scan.nextLine();
					System.out.println();
					System.out.print("Password: ");
					
					Pass2=scan.nextLine();
					
					if(ID2.equals(ID1) && Pass2.equals(Pass1)) {
						System.out.println("Giri� ba�ar�l�");
					}
					else {
						System.out.println("Kullan�c� ad� veya �ifre yanl��!");
					}
			}	
			
		}
		else {
			System.out.println("Eksik ya da yanl�� tu�lama yapt�n�z.");
		}
		
			}
			
		
		

	}

