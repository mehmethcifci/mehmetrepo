package Cuma;

public class LaptopMainCagri {

	public static void main(String[] args) {

		
		LaptopCagri PC1 = new LaptopCagri();
		PC1.setBrand("Monster");
		PC1.setRamSize(16);
		PC1.setScreenSize(12.2);
		PC1.setBatteryCapacity(100);
		
		PC1.connectWeb();
		PC1.showFeatures();
		PC1.remainingBattery(50);
		
		
		LaptopCagri laptop2 = new LaptopCagri();
		laptop2.setBrand("Dell");
		laptop2.setRamSize(32);
		laptop2.setScreenSize(13.1);
		laptop2.setBatteryCapacity(45);
		laptop2.connectWeb();
		laptop2.showFeatures();
		laptop2.remainingBattery(35);
		
		String str = laptop2.getBrand();
		System.out.println(str);
		
		
	}

}
