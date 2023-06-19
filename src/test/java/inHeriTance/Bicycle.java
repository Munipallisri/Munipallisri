package inHeriTance;

class Bicycles {
	public int gear;
	public int speed;

	public Bicycles(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	public void applyBreak(int decrement) {
		speed -= decrement;

	}

	public void speedUp(int increament) {
		speed += increament;
	}

	public String toString() {
		return ("no of gears " + gear + "\n" + "speed of bicycle" + speed);
	}
}

class MountainBike extends Bicycles {
	public int seatHeight;

	public MountainBike(int gear, int speed, int startHeight) {
		super(gear, speed);
		seatHeight = startHeight;

	}

	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

	@Override
	public String toString() {
		return (super.toString() + "\nseatHeight" + seatHeight);
	}
}

public class Bicycle {
	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3, 300, 75);
		System.out.println(mb.toString());

	}

}
