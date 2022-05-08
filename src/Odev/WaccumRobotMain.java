package Odev;

public class WaccumRobotMain {
	
	public static void main(String[] args) {
		
	
	
	WaccumRobot robot = new WaccumRobot();
	
	while (true) {
		robot.ortamiTara();
		robot.haritaOlustur();
		robot.vakumAc();
		robot.rotaPlanla(3, 5);
		robot.rotayiTakipEt();
		robot.sarjGoster();
		robot.rotaPlanla(5, 6);
		robot.rotayiTakipEt();
		robot.sarjGoster();
		robot.istasyonaDon();		
		break;
	}

}
}