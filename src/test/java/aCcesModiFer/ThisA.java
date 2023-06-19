package aCcesModiFer;

class ThisA {
	int a;
	int b;

//	ThisA(int a, int b) {
//		this.a = a;
//		this.b = b;
//	}

	void display() {
		System.out.println("a= " + a + " b  = " + b);
	}

	public static void main(String[] args) {
		ThisA object = new ThisA(10,20);
		object.display();
	}
}
