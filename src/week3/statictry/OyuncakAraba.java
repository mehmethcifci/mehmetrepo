package week3.statictry;

public class OyuncakAraba {

	private int batteryCapacity;
	int         distanceX;
	int         distanceY;

	private int kalanBataryaOmru() {
		return this.batteryCapacity;
	}

	public void xEksenindeHareket() {

		if (hareketEdebilir()) {
			this.distanceX++;
		}
		konumVeCapacityBilgisiniYazdir();
	}

	public void yEksenindeHareket() {
		if (hareketEdebilir()) {
			this.distanceY++;
		}
		konumVeCapacityBilgisiniYazdir();
	}

	public boolean hareketEdebilir() {
		if (batteryCapacity > 0) {
			batteryCapacity--;
			return true;
		} else {
			System.out.println("Bataryanýn þarj edilmesi gerekiyor.");
			return false;
		}

	}

	public void konumVeCapacityBilgisiniYazdir() {
		System.out.println("X ekseni= " + this.distanceX + ", Y ekseni= " + this.distanceY + ", Kalan batarya= "
				+ this.batteryCapacity);
	}

	public void sarjEt() {

		this.batteryCapacity = 5;
		System.out.println("Araba þarj edildi");

	}
	
	public OyuncakAraba() {
		
		this.batteryCapacity=5;
	}

}
