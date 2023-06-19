package aCcesModiFer;

import java.io.*;

class vehicle {
	public void vehicleno(String name, int roll_no) {
		System.out.println("Name :" + name + " " + "Roll-No :" + roll_no);

	}

	public void vehicleno(int roll_no, String name) {
		System.out.println("Roll-No :" + roll_no + " " + "Name :" + name);
	}
}

class OLmTHd {
	public static void main(String[] args) {
		vehicle obj = new vehicle();
		obj.vehicleno("Spyd3r", 1);
		obj.vehicleno(2, "Kamlesh");
	}
}
