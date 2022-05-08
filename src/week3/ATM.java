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
				System.out.print("Kullaný adý:");
				
				kullanici1= scan.nextLine();
				System.out.println();
				System.out.print("Parola:");
				
				sifre1=scan.nextInt();
				scan.nextLine();
				
			if (kullanici.equals(kullanici1) && sifre == sifre1) {	
				break;
			}
				
			
			else {
					System.out.println("Yanlýþ giriþ yaptýnýz.");
					yanlisGiris++;
				}
			
			}
			if (yanlisGiris>3) {
				System.out.println("Kartýnýz bloke olmuþtur.");
			}
			
				
				
			
			while (yanlisGiris <=3 ){
		
					
					
					System.out.println("1)Para Yatýrma");
					System.out.println("2)Para Çekme");
					System.out.println("3)Bakiye Sorgulama");
					System.out.println("4)Çýkýþ yapma");
					System.out.print("Yapmak istediðiniz iþlemi seçiniz: ");
					System.out.println();
					
					
					menu= scan.nextInt();
				
				
					switch(menu) {
				
				
						case 1 :
							System.out.println("Yatýrmak istediðiniz tutarý yerleþtirip Tamam'a basýnýz");
							break;
						case 2 :
							System.out.print("Çekmek istediðiniz tutarý giriniz");
						
							
							tutar=scan.nextInt();
								
									if (tutar>kalan) {
									System.out.println("Yetersiz Bakiye");
									}
									else {
									kalan= bakiye - tutar;
									System.out.println("Para çekme iþleminiz baþarýyla gerçekleþmiþtir. Kalan bakiye: " + kalan);
								
									}
							break;
					
						case 3:	
						System.out.println("Kalan bakiyeniz: " + kalan);
							break;
						
						case 4 : 
						System.out.println("Baþarýyla çýkýþ yaptýnýz");
						
						System.exit(0);	
						break;	
						
					}
				}
			} 
	}
