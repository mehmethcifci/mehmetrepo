package OdevCozumleri;

public class ToyCar {
	private int batteryCapacity;
	int distanceTravelledForward;
	int distanceTravelledRight;
	

	private void remainingBattery() {
		System.out.println("Remaning Battery: " + batteryCapacity);
		
		if(batteryCapacity <=0) {
			System.out.println("Dead Battery! Please charge!");
		}
		
	}
	void charge() {
		if(batteryCapacity >=5) {
			System.out.println("Battery full!");
		}else {
			batteryCapacity++;
			remaningBattery();
		}
		
	}
}
