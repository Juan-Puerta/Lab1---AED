package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Polynomial;

class TestBairstow {

	private Polynomial thePoly;
	
	public void scenarioOne() {
		thePoly = new Polynomial(new double[] {6,5,1});
	}
	
	public void scenarioTwo() {
		thePoly = new Polynomial(new double[] {1,-3,-4,12});
	}
	
	public void scenarioThree() {
		thePoly = new Polynomial(new double[] {3,12});
	}
	
	@Test
	public void giveRootsTest1() {
		scenarioOne();
		double[] expectedRoots = {0.0,-3.0,-2.0};
		double[] actual = thePoly.getTheBairstow().Bairstow(thePoly.getConstant());
		assertArrayEquals(expectedRoots, actual);
	}
	
	@Test
	public void giveRootsTest2() {
		scenarioTwo();
		double[] expectedRoots = {0, 0.5000000055331547, -0.5, 0.33333333333333337};
		double[] actual = thePoly.getTheBairstow().Bairstow(thePoly.getConstant());
		assertArrayEquals(expectedRoots, actual);
	}
	
	@Test
	public void giveRootsTest3() {
		scenarioThree();
		double[] expectedRoots = {0, -0.25};
		double[] actual = thePoly.getTheBairstow().Bairstow(thePoly.getConstant());
		assertArrayEquals(expectedRoots, actual);
	}


}
