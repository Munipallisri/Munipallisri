package aCcesModiFer;

class A{
	protected void display() {
		System.out.println("Soft ware testing");
	}
}
class B extends A{}
class C extends B{}

class PrCtEx1{
	public static void main(String args[])
	{
		B bobj=new B();
		bobj.display();
		C cobj=new C();
		cobj.display();
	}
}