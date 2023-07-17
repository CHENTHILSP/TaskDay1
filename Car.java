package julyday1;

public class Car {
	
	public void applyBreak() {
		System.out.println("breakApplied");
	}
	
	public void applyGear() {
		System.out.println("gearApplied");
	}
	
	public void switchOnAc() {
		System.out.println("acOn");
	}
	public void applyAcclerate() {
		System.out.println("applyAcclerate");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Gmc=new Car();
		Gmc.applyBreak();
		Gmc.applyGear();
		Gmc.applyAcclerate();
		Gmc.switchOnAc();

		

	}

}
