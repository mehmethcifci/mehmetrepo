package week3;

import java.util.Scanner;

public class ATM {


	public static void main(String[] args) {
			
		Scanner scan= new Scanner(System.in);
			
			
			String kullanici="user";
			int sifre=123;
			String kullanici1=null;
			int sifre1;
			int menu;
			int bakiye= 1500;
			int tutar;
			int kalan=bakiye;
			int yanlisGiris=0;
			
			
			
			while (yanlisGiris <=3  ){
				System.out.print("Kullan� ad�:");
				
				kullanici1= scan.nextLine();
				System.out.println();
				System.out.print("Parola:");
				
				sifre1=scan.nextInt();
				scan.nextLine();
				
			if (kullanici.equals(kullanici1) && sifre == sifre1) {	
				break;
			}
				
			
			else {
					System.out.println("Yanl�� giri� yapt�n�z.");
					yanlisGiris++;
				}
			
			}
			if (yanlisGiris>3) {
				System.out.println("Kart�n�z bloke olmu�tur.");
			}
			
				
				
			
			while (yanlisGiris <=3 ){
		
					
					
					System.out.println("1)Para Yat�rma");
					System.out.println("2)Para �ekme");
					System.out.println("3)Bakiye Sorgulama");
					System.out.println("4)��k�� yapma");
					System.out.print("Yapmak istedi�iniz i�lemi se�iniz: ");
					System.out.println();
					
					
					menu= scan.nextInt();
				
				
					switch(menu) {
				
				
						case 1 :
							System.out.println("Yat�rmak istedi�iniz tutar� yerle�tirip Tamam'a bas�n�z");
							break;
						case 2 :
							System.out.print("�ekmek istedi�iniz tutar� giriniz");
						
							
							tutar=scan.nextInt();
								
									if (tutar>kalan) {
									System.out.println("Yetersiz Bakiye");
									}
									else {
									kalan= bakiye - tutar;
									System.out.println("Para �ekme i�leminiz ba�ar�yla ger�ekle�mi�tir. Kalan bakiye: " + kalan);
								
									}
							break;
					
						case 3:	
						System.out.println("Kalan bakiyeniz: " + kalan);
							break;
						
						case 4 : 
						System.out.println("Ba�ar�yla ��k�� yapt�n�z");
						
						System.exit(0);	
						break;	
						
					}
				}
			} 
	}
