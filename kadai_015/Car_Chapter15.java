package kadai_015;

public class Car_Chapter15 {
	
	private int gear = 1;
	private int speed = 10;
	
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void changeGear(int afterGear) {
		int beforeGear = this.gear;
		this.gear = afterGear;
		
		if (afterGear > 5 || afterGear < 1 ) {
			System.out.println("ギア数無効");
			return;
		}
		
		System.out.println("ギア" + beforeGear + "から" + this.gear + "に切り替えました");
	}
	
	public void run() {
		switch (this.gear) {
		case 1:
			this.speed = 10;
			break;
		case 2:
			this.speed = 20;
			break;
		case 3:
			this.speed = 30;
			break;
		case 4:
			this.speed = 40;
			break;
		case 5:
			this.speed = 50;
			break;

		default:
			this.speed = 10;
			break;
		}
		System.out.println("速度は時速" + this.speed + "kmです");
	}
		
	
		
	}