package aCcesModiFer;

class Dataclass {
	private String strnname;

//getter method
	public String getName() {
		return this.strnname;

	}

//setter method
	public void setName(String name) {
		this.strnname = name;
	}

}

public class GetSet {
	public static void main(String[] args) {
		Dataclass d = new Dataclass();
		// access the private variable using the getter and setter
		d.setName("Hello Every One");
		System.out.println(d.getName());

	}
}
