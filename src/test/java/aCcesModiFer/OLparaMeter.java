package aCcesModiFer;

class product {
	public int multiply(int a, int b) {
		int prod = a * b;
		return prod;
	}

	public int multiply(int a, int b, int c) {
		int prod = a * b * c;
		return prod;
	}
}

class OLparaMeter {
	public static void main(String[] args) {
		product ob = new product();
		int prod1 = ob.multiply(1, 2);
		System.out.println("Product of the two integer value :" + prod1);

		int prod2 = ob.multiply(1, 2, 3);
		System.out.println("Product of the two integer value :" + prod2);

	}
}