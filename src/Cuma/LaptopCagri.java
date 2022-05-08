package Cuma;

public class LaptopCagri {
	
	private String brand;
	private int ramSize;
	private int batteryCapacity;
	private double screenSize;
	
	
	void connectWeb() {
		System.out.println(brand +" internete baðlandý.");
	}
	void showFeatures() {
		
		System.out.println("Brand= "+brand+ ", " + "ramSize= " + ramSize + ", " + "screenSize= " + screenSize);
		
	}
	void remainingBattery(int batteryCapacity) {
		System.out.println("Kalan Batarya: %" + batteryCapacity);	
	}
	
	
	
	public String getBrand() {
		return this.brand;
	}
	public int getRamSize() {
		return this.ramSize;
	}
	public int getBatteryCapacity() {
		return this.batteryCapacity;
	}
	public double getScreenSize() {
		return this.screenSize;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
	

}
