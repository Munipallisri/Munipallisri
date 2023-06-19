package aCcesModiFer;

class Testclass {
	private int num = 100;

	private void printMessage() {
		System.out.println("Hello Java");
	}
}

public class PrVtAc {
	public static void main(String[] args) {
		Testclass obj = new Testclass();
		System.out.println(obj.num);
		obj.printMessage();

	}

}