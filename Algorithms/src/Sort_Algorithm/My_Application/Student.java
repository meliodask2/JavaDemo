package Sort_Algorithm.My_Application;

public class Student {

	private String id;
	private String firstName;
	private String lastName;
	private double math;
	private double physics;
	private double chemiscal;

//	public Student(String id, String firstName, String lastName, double math, double physics, double chemiscal) {
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.math = math;
//		this.physics = physics;
//		this.chemiscal = chemiscal;
//	}

	@Override
	public String toString() {
		return "" + id + "\t" + firstName + " " + lastName + "\t\t" + math + "\t" + physics
				+ "\t" + chemiscal + "";
	}

	public Student(String id, String firstName, String lastName, double math, double physics, double chemiscal) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.math = math;
	this.physics = physics;
	this.chemiscal = chemiscal;
}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getChemiscal() {
		return chemiscal;
	}

	public void setChemiscal(double chemiscal) {
		this.chemiscal = chemiscal;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
