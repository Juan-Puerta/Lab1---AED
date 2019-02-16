package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Polynomial;

class TestNewton {

private Polynomial thePoly;
	
	public void scenarioOne() {
		thePoly = new Polynomial(new double[] {1,-5,6,2});
	}
	
	public void scenarioTwo() {
		thePoly = new Polynomial(new double[] {2,-5,6,7,2,3});
	}
	
	public void scenarioThree() {
		thePoly = new Polynomial(new double[] {2,-5,6,7,2,3,6,1,6,4});
	}
	
	@Test
	public void giveRootNewton1() {
		scenarioOne();
		double expected = -5.542872729468412;
		double actual = thePoly.getTheNewton().solveRoots(thePoly.getConstant());
		assertEquals(expected, actual);
	}

	@Test
	public void giveRootNewton2() {
		scenarioTwo();
		double expected = -1.6363636363636362;
		double actual = thePoly.getTheNewton().solveRoots(thePoly.getConstant());
		assertEquals(expected, actual);
	}
	
	@Test
	public void giveRootNewton3() {
		scenarioThree();
		double expected = -1.8691804540207773;
		double actual = thePoly.getTheNewton().solveRoots(thePoly.getConstant());
		assertEquals(expected, actual);
	}

}
