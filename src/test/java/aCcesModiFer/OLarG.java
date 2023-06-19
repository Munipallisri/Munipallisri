package aCcesModiFer;

import java.io.*;

class products {
	public int prod(int a, int b, int c) {
		int prod1 = a * b * c;
		return prod1;
	}

	public double prod(double a, double b, double c) {
		double prod2 = a * b * c;
		return prod2;
	}
}

class OLarG {
	public static void main(String[] args) {
		products obj = new products();
		int prod1 = obj.prod(1, 2, 3);
		System.out.println("Product of the three integer value :" + prod1);
		double prod2 = obj.prod(1.0, 2.0, 3.0);
		System.out.println("Product of the three double value :" + prod2);
	}
	}
