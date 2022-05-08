package Odev;


public class WaccumRobot {

	public static final int istasyonX = 0;
	public static final int istasyonY = 0;
	
	private int battery;
	private int konumX;
	private int konumY;
	private int planlananX;
	private int planlananY;
	

	private boolean vakumAcildimi;
	private boolean robotAcildimi;
	private boolean rotaPlanlandimi;
	private boolean haritaOlusturuldumu;
	private boolean sarj›stasyonunaDonuldumu;
	private boolean alanTarandimi;
	private boolean bataryaYeterlimi;
	
	
	public WaccumRobot() {
		
		this.battery = 100;
		this.alanTarandimi = false;
		this.bataryaYeterlimi = false;
		this.haritaOlusturuldumu = false;
		this.robotAcildimi = true;
		this.rotaPlanlandimi = false;
		this.sarj›stasyonunaDonuldumu = false;
		this.vakumAcildimi = false;
	
		
		
	}
	
	public boolean vakumAcildimi(){
		
		return this.vakumAcildimi;
	}
	public boolean robotAcildimi(){
		
		return this.robotAcildimi;
		
	}
	public boolean rotaPlanlandimi(){
		
		
		return this.rotaPlanlandimi;
		
	}
	public boolean haritaOlusturuldumu(){
		
		if (alanTarandimi()) {
		return this.haritaOlusturuldumu;	
	
		}
		else {
			return false;
		}

	}
	public boolean sarjIstasyonunaDonuldumu(){
		
		if (vakumAcildimi() && robotAcildimi()) {
			return this.sarj›stasyonunaDonuldumu;
		}
		else {
			return false;
		}

	}
	public boolean alanTarandimi(){
		
		return this.alanTarandimi;
		
	}
	public boolean bataryaYeterlimi() {
		
		if ( this.battery <=10) {
			return false;
		}
		else {
			return true;
		}

	}
	public void ortamiTara() {
		if (robotAcildimi()) {
			this.alanTarandimi = true;
			System.out.println("Ortam tarand˝.");
		}
		else {
			this.alanTarandimi = false;
			System.out.println("Ortam taranamad˝.");
		}
		
	}
	public void haritaOlustur() {
		if(alanTarandimi()) {
			this.haritaOlusturuldumu = true;
			System.out.println("Harita Olu˛turuldu.");
		}
		else {
			this.haritaOlusturuldumu = false;
			System.out.println("Harita olu˛turulamad˝.");
		}
	}
	public void rotaPlanla(int x, int y) {
		float yerDegistirme = (float) Math.sqrt((x-this.konumX) * (x-this.konumX) + (y-this.konumY) * (y-this.konumY));
		System.out.println("Yerdei˛tirme: " + yerDegistirme);
		
		this.rotaPlanlandimi = true;
		this.planlananX=x;
		this.planlananY=y;
	}
	
	public void vakumAc() {
		if(bataryaYeterlimi()) {
			this.vakumAcildimi = true;
			System.out.println("Vakum aÁ˝ld˝.");
		}
		else {
			this.vakumAcildimi = false;
			System.out.println("Vakum aÁmak iÁin batarya yetersiz.");
		}
		
	}
	private void piliAzalt(int x, int y) {
		int yerDegistirme = (int) Math.sqrt((x-this.konumX) * (x-this.konumX) + (y-this.konumY) * (y-this.konumY));
		
		this.battery -= yerDegistirme;
		
	}
	
	
	public void istasyonaDon() {
		this.konumX = istasyonX;
		this.konumY = istasyonY;
		
		piliAzalt(this.konumX, this.konumY);
		this.battery = 100;
		System.out.println("Batarya ˛arj edildi.");
	}

	public void rotayiTakipEt() {
		
		int yerDegistirme = (int) Math.sqrt((this.planlananX-this.konumX) * (this.planlananX-this.konumX) + (this.planlananY-this.konumY) * (this.planlananY-this.konumY));
		piliAzalt(this.planlananX, this.planlananY);
		this.konumX = this.planlananX;
		this.konumY = this.planlananY;
		
	}
	public void sarjGoster() {
		System.out.println("ﬁarj: " + this.battery);
		
		
	}
	
}


