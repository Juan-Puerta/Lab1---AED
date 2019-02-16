package model;

public class Polynomial {

	private int grade;
	private double[] constant;

	private BairstowMethod theBairstow;
	private NewtonMethod theNewton;

	public Polynomial(double[] constant) {

		this.constant = constant;
		this.grade = constant.length;
		
		theBairstow = new BairstowMethod();
		theNewton = new NewtonMethod();

	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double[] getConstant() {
		return constant;
	}

	public void setConstant(double[] constant) {
		this.constant = constant;
	}

	public BairstowMethod getTheBairstow() {
		return theBairstow;
	}

	public void setTheBairstow(BairstowMethod theBairstow) {
		this.theBairstow = theBairstow;
	}

	public NewtonMethod getTheNewton() {
		return theNewton;
	}

	public void setTheNewton(NewtonMethod theNewton) {
		this.theNewton = theNewton;
	}
}
