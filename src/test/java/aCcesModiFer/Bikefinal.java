package aCcesModiFer;

class honda {
	final void run() {System.out.println("Good");}
}

class Bikefinal extends honda {
	void run() {
		System.out.println("bad");
	}

	public static void main(String[] args) {
		Bikefinal objhonda = new Bikefinal();
		objhonda.run();
	}

}
